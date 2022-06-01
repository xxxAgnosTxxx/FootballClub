package com.prokhorov.demo.services;

import com.prokhorov.demo.entities.Footballer;
import com.prokhorov.demo.repositories.FootballerRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FootballerService {
    private FootballerRepository repository;

    public FootballerService(FootballerRepository repository) {
        this.repository = repository;
    }

    //возвращает итоговый список подходящих игроков
    public List<Footballer> getTopFootballers(int count, String position) {
        List<Footballer> all = repository.findAll();
        List<Footballer> tempList = all.stream().
                filter(x -> x.isReady() && x.getPosition().equals(position))
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        if (tempList.size() > count) {
            return tempList.stream()
                    .filter(x -> tempList.indexOf(x) < count)
                    .collect(Collectors.toList());
        } else if (tempList.size() < count && all.size() >= count) {
            List<Footballer> finalTopList = new ArrayList<>(tempList);
            List<Footballer> listSource = getAdditionalList(finalTopList, position);
            int upSize = count - finalTopList.size();

            finalTopList.addAll(listSource.stream()
                    .filter(x -> upSize > listSource.indexOf(x))
                    .collect(Collectors.toList()));

            return finalTopList;

        } else {
            return tempList;
        }
    }

    //возвращает список подходящих игроков с других позиций
    private List<Footballer> getAdditionalList(List<Footballer> finalTopList, String position) {
        List<Footballer> all = repository.findAll();
        List<Footballer> listSource;
        int minSkillLvl = 40;

        if (position.equals("forward")) {
            listSource = all.stream()
                    .filter(x -> x.isReady() && x.getForwardSkills() >= minSkillLvl && !finalTopList.contains(x))
                    .sorted()
                    .collect(Collectors.toList());
        } else if (position.equals("halfback")) {
            listSource = all.stream()
                    .filter(x -> x.isReady() && x.getHalfbackSkills() >= minSkillLvl && !finalTopList.contains(x))
                    .sorted()
                    .collect(Collectors.toList());
        } else if (position.equals("back")) {
            listSource = all.stream()
                    .filter(x -> x.isReady() && x.getBackSkills() >= minSkillLvl && !finalTopList.contains(x))
                    .sorted()
                    .collect(Collectors.toList());
        } else {
            listSource = all.stream()
                    .filter(x -> x.isReady() && x.getGkSkills() >= minSkillLvl && !finalTopList.contains(x))
                    .sorted()
                    .collect(Collectors.toList());
        }

        return listSource;
    }
}