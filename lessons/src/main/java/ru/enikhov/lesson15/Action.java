package ru.enikhov.lesson15;

import java.io.File;

public interface Action {

    void createObj(File name);

    void deleteObj(File name);

    void renameObj(File nameOld, File nameNew);

    void copyObj(File nameOld, File nameNew);

}
