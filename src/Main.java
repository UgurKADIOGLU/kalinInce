public class Main {

    public static void main(String[] args) {
	char[] kalinSesli={'a', 'ı', 'o', 'u'};
    char[] inceSesli={'e', 'i', 'ö', 'ü'};
    char ses='a';

        for (char kalin:kalinSesli
             ) {
            if(kalin==ses){
                System.out.println(ses+" kalın sesli");
            }
        }

        for (char ince:inceSesli
        ) {
            if(ince==ses){
                System.out.println(ses+" ince sesli");
            }
        }
    }
}
