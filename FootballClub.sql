PGDMP                         z            FootballClub    14.3    14.3     ?           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            ?           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            ?           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            ?           1262    16558    FootballClub    DATABASE     k   CREATE DATABASE "FootballClub" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Russian_Russia.1251';
    DROP DATABASE "FootballClub";
                postgres    false            ?            1259    16560    person    TABLE     ?  CREATE TABLE public.person (
    id integer NOT NULL,
    name text NOT NULL,
    surname text NOT NULL,
    "position" text NOT NULL,
    health integer NOT NULL,
    stamina integer NOT NULL,
    dribbling integer NOT NULL,
    accuracy integer NOT NULL,
    reflexes integer NOT NULL,
    gk_skills integer NOT NULL,
    back_skills integer NOT NULL,
    halfback_skills integer NOT NULL,
    forward_skills integer NOT NULL
);
    DROP TABLE public.person;
       public         heap    postgres    false            ?            1259    16559    Person_id_seq    SEQUENCE     ?   CREATE SEQUENCE public."Person_id_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public."Person_id_seq";
       public          postgres    false    210            ?           0    0    Person_id_seq    SEQUENCE OWNED BY     A   ALTER SEQUENCE public."Person_id_seq" OWNED BY public.person.id;
          public          postgres    false    209            \           2604    16563 	   person id    DEFAULT     h   ALTER TABLE ONLY public.person ALTER COLUMN id SET DEFAULT nextval('public."Person_id_seq"'::regclass);
 8   ALTER TABLE public.person ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    210    209    210            ?          0    16560    person 
   TABLE DATA           ?   COPY public.person (id, name, surname, "position", health, stamina, dribbling, accuracy, reflexes, gk_skills, back_skills, halfback_skills, forward_skills) FROM stdin;
    public          postgres    false    210          ?           0    0    Person_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public."Person_id_seq"', 1, false);
          public          postgres    false    209            ^           2606    16567    person Person_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.person
    ADD CONSTRAINT "Person_pkey" PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.person DROP CONSTRAINT "Person_pkey";
       public            postgres    false    210            ?   ?  x?UT?n?H|????s?&?\Hd???y?c?ECRY???z(Y
@(㠏????????!?:??-??w?YOΓ?d-??j?-?OQ?M??Zu???p????T|??&S??B?zJ?SO??K?[B]S?-??D>????)?͐??8t????*?lŕZQ-?O???ð?#????ܴ????S|?qE0??%?yN????z~???ǫx??>c
d<c?"e??U???)ҥ?b?Z1?7??l%<???Kܡ?]?_uq??.?Ce?B?G? ?r;????S??c?/Y?qr񰆤*?PJ	Yѧ??#?>? }??ንaJ?????? J#????)?	??nJ?,mX--?xK?]?aP?M???ï.???????<ft_ ??҆V)????^1?8P???,$U?y?F4?Q~/)??cT??܉q??fn2]?UQ}ty??=Uj/??_?|?3J??4Ӗ?(6>)V? ???}j6?s?&???O??٠4??>?K =??.һW?q?g?m?X`?q? B????ؿFZ??Y&$?U`$ֲ?5??C3g:O?)??1<?by??6k?>vqK?q??%|??Xt??V?U?????c?O?0?E??Mq?.?0?A?`Q?Ƕk????gl??$*W^?o?	?"M6s?+?#u????)??},?0?A?6n?/t;?16g`mS??`Vpz??N??6?^?]??CǕm???LRԎ????yx????=??/`??ܽu?`T_??è?P???+Eڡ??1??M???p%?d?Q rx??:?x?????csl^ө????5`??[5/?P???;?2T?????1V?pq??c???&?#};?b?9?F?^vd|??q/Ҹ??8ؔ???f-~?%??-?x     