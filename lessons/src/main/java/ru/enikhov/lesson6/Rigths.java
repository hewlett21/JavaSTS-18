package ru.enikhov.lesson6;

import java.text.SimpleDateFormat;
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

    public Date getStartDate() {
        return startDate;
    }

    public String getRtType() {
        return rtType;
    }

    public String getRtNum() {
        return rtNum;
    }

    public String getRtDesc(ReObject objRt, Subjects subRt) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.YYYY");
        return "Объект права: " + objRt.getDesc() + "\nПравообладатель: " + subRt.getDescSubject() +
                "\nНомер права: " + getRtNum() + "\nДата возникновения права: " + dateFormat.format(getStartDate()) +
                "\nТип собственности: " + getRtType();
    }


}
