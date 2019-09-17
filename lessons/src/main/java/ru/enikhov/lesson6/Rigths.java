package ru.enikhov.lesson6;

import java.util.Date;

public class Rigths {
    private String rtNum;// номер права
    private String rtType;// тип права {Право собственности; Ограничение права}
    private Date startDate; //дата начала права/ограничения
    private Date endDate; // дата окончания права/ограничения

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setRtType(String rtType) {
        this.rtType = rtType;
    }

    public void setRtNum(String rtNum) {
        this.rtNum = rtNum;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Date getStartDate(Date date) {
        return startDate;
    }

    public String getRtType() {
        return rtType;
    }

    public String getRtNum() {
        return rtNum;
    }

    public String getRtDesc(Object objRt, Subjects subRt) {
        return "Объект права: " + objRt.getDesc() + "\nПравообладатель: " + subRt.getDescSubject() +
                "\nНомер права: " + getRtNum() + "\nТип собственности: " + getRtType();
    }


}
