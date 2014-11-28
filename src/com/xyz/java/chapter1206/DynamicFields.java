package com.xyz.java.chapter1206;

import java.util.Objects;

/**
 * Created by windview on 11/28/14.
 */
public class DynamicFields {

    private Object[][] fields;

    public DynamicFields(int initialSize) {
        fields = new Object[initialSize][2];
        for (int i=0;i<initialSize;i++)
            fields[i] = new Object[]{null, null};
    }
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Object[] obj: fields) {
            result.append(obj[0]);
            result.append(": ");
            result.append(obj[1]);
            result.append("\n");
        }
        return result.toString();
    }

    private int hasFiled(String id) {
        for (int i=0;i<fields.length;i++) {
            if (id.equals(fields[i][0]))
                return i;

        }
        return -1;

    }

    private int getFileNumber(String id) throws NoSuchFieldException {
        int fieldNum = hasFiled(id);
        if (fieldNum == -1)
            throw new NoSuchFieldException();
        return fieldNum;
    }

    private int makeField(String id) {
        for (int i = 0; i < fields.length; i++) {
            if (fields[i][0] == null) {
                fields[i][0] = id;
                return i;
            }
        }
        return -1;
    }
}

