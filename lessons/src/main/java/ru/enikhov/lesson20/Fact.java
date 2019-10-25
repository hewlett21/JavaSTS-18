package ru.enikhov.lesson20;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Fact {
    private String text;
    private boolean found;
    private int number;
    private String type;
    private String date;

    public void setText(String text) {
        this.text = text;
    }

    public void setFound(boolean found) {
        this.found = found;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public void getDescription() {
        System.out.println("Описание ресурса:");
        System.out.println("Bring meaning to your metrics and stories to your dates with our API of interesting number facts.");
        System.out.println("=================================================================================================");
        System.out.println("Описание полей класса:");
        System.out.println("text: A string of the fact text itself.\n" +
                "found: Boolean of whether there was a fact for the requested number.\n" +
                "number: The floating-point number that the fact pertains to. This may be useful for, eg. a /random request or\n" +
                "notfound=floor. For a date fact, this is the 1-indexed day of a leap year (eg. 61 would be March 1st).\n" +
                "type: String of the category of the returned fact.\n" +
                "date (sometimes): A day of year associated with some year facts, as a string.\n" +
                "year (sometimes): A year associated with some date facts, as a string.");
        System.out.println("==================================================================================================");
    }

    public Fact() {
    }

    @Override
    public String toString() {
        return "Fact{" +
                "date='" + date + '\'' +
                ", text='" + text + '\'' +
                ", found=" + found +
                ", number=" + number +
                ", type='" + type + '\'' +
                '}';
    }
}
