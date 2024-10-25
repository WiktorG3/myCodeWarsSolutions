/*
Your start-up's BA has told marketing that your website has a large audience in Scandinavia and surrounding countries. Marketing thinks it would be great to welcome visitors to the site in their own language. 
Luckily you already use an API that detects the user's location, so this is an easy win.
The Task
Think of a way to store the languages as a database. The languages are listed below so you can copy and paste!
Write a 'welcome' function that takes a parameter 'language', with a type String, and returns a greeting - if you have it in your database. It should default to English if the language is not in the database, or in the event of an invalid input.
The Database
Please modify this as appropriate for your language.
[ ("english", "Welcome")
, ("czech", "Vitejte")
, ("danish", "Velkomst")
, ("dutch", "Welkom")
, ("estonian", "Tere tulemast")
, ("finnish", "Tervetuloa")
, ("flemish", "Welgekomen")
, ("french", "Bienvenue")
, ("german", "Willkommen")
, ("irish", "Failte")
, ("italian", "Benvenuto")
, ("latvian", "Gaidits")
, ("lithuanian", "Laukiamas")
, ("polish", "Witamy")
, ("spanish", "Bienvenido")
, ("swedish", "Valkommen")
, ("welsh", "Croeso")
]
Possible invalid inputs include:
IP_ADDRESS_INVALID - not a valid ipv4 or ipv6 ip address
IP_ADDRESS_NOT_FOUND - ip address not in the database
IP_ADDRESS_REQUIRED - no ip address was supplied
*/

import java.util.HashMap;
import java.util.Map;
public class Welcome {
    private static final Map<String, String> languageDatabase = new HashMap<>();

    // Static block to initialize the database
    static {
        languageDatabase.put("english", "Welcome");
        languageDatabase.put("czech", "Vitejte");
        languageDatabase.put("danish", "Velkomst");
        languageDatabase.put("dutch", "Welkom");
        languageDatabase.put("estonian", "Tere tulemast");
        languageDatabase.put("finnish", "Tervetuloa");
        languageDatabase.put("flemish", "Welgekomen");
        languageDatabase.put("french", "Bienvenue");
        languageDatabase.put("german", "Willkommen");
        languageDatabase.put("irish", "Failte");
        languageDatabase.put("italian", "Benvenuto");
        languageDatabase.put("latvian", "Gaidits");
        languageDatabase.put("lithuanian", "Laukiamas");
        languageDatabase.put("polish", "Witamy");
        languageDatabase.put("spanish", "Bienvenido");
        languageDatabase.put("swedish", "Valkommen");
        languageDatabase.put("welsh", "Croeso");
    }
   public static String greet(String language){
      return languageDatabase.getOrDefault(language.toLowerCase(), "Welcome");
   }
}
