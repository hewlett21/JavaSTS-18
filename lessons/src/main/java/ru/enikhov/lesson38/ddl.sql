CREATE TABLE public.address
(
    id integer NOT NULL,
    parent_id integer,
    name character varying(50)  NOT NULL,
    type integer NOT NULL,
    CONSTRAINT pk_address PRIMARY KEY (id)
);


CREATE TABLE public.emps
(
    id integer NOT NULL,
    fio character varying(50)  NOT NULL,
    adr_id integer NOT NULL,
    date_born date NOT NULL,
    ser_doc character varying(10) NOT NULL,
    num_doc integer NOT NULL,
    sex character varying(1)  NOT NULL,
    CONSTRAINT pk_emps PRIMARY KEY (id),
    CONSTRAINT emps_address_fk FOREIGN KEY (adr_id)
        REFERENCES public.address (id) 
    CONSTRAINT dt_born_check CHECK (date_born <= CURRENT_DATE),
    CONSTRAINT sex_check CHECK (sex::text = ANY (ARRAY['М'::character varying, 'Ж'::character varying]::text[]))
);

CREATE TABLE public.objects
(
    id integer NOT NULL,
    cad_num character varying(50)  NOT NULL,
    adr_id integer NOT NULL,
    date_begin date NOT NULL,
    date_end date,
    square double precision NOT NULL,
    type integer NOT NULL,
    CONSTRAINT pk_objects PRIMARY KEY (id),
    CONSTRAINT objects_address_fk FOREIGN KEY (adr_id)
        REFERENCES public.address (id) 
);

CREATE TABLE public.rights
(
    id integer NOT NULL,
    num character varying(30)  NOT NULL,
    type character varying(30) NOT NULL,
    date_start date NOT NULL,
    date_end date,
    object_id integer NOT NULL,
    emp_id integer NOT NULL,
    CONSTRAINT pk_rights PRIMARY KEY (id),
    CONSTRAINT rt_emp_fk FOREIGN KEY (emp_id)
        REFERENCES public.emps (id),
    CONSTRAINT rt_object_fk FOREIGN KEY (object_id)
        REFERENCES public.objects (id),
    CONSTRAINT rt_check CHECK (type::text = ANY (ARRAY['Право'::character varying, 'Ограничение'::character varying]::text[]))
);


