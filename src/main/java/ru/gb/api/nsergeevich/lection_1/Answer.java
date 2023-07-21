package ru.gb.api.nsergeevich.lection_1;

class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS) {
        // Напишите свое решение ниже
        StringBuilder sb = new StringBuilder();
        sb.append(QUERY);
        String newString = PARAMS.replace("{", "").replace("}", "");
        String str[] = newString.split(",");
        for (String param: str) {
            String keyValue[] = param.split(":");
            String key = keyValue[0];
            String value = keyValue[1];
            if (!value.equals("null")){
                sb.append(key).append(value);
            }
        }
        return sb;
    }
}