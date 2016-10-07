package m2_syntax;

public class Ex_2_4_10_Poem {
    public static void main(String[] args) {
        String[] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
        String[] textLines = {
            "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
            "Аммос Федорович: Как ревизор?",
            "Артемий Филиппович: Как ревизор?",
            "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
            "Аммос Федорович: Вот те на!",
            "Артемий Филиппович: Вот не было заботы, так подай!",
            "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
        };
        System.out.println(printTextPerRole(roles, textLines));
    }

    private static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder sb = new StringBuilder(1000);
        String dot = ":", newLine = "\n", skobka = ")";
        for (int i = 0; i < roles.length; i++) {
            sb.append(roles[i]).append(dot).append(newLine);
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(roles[i] + ": ")) {
                    sb.append(j + 1)
                        .append(skobka)
                        .append(textLines[j].substring(roles[i].length()+1))
                        .append(newLine);
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
