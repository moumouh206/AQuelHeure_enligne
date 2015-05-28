package com.mba2dna.aquelheure_enligne.model;

/**
 * Created by MBA2DNA on 28/05/2015.
 */
public class Gare {
    public static final String GARES[] = {
            "AGHA", "AIN ABID", "AIN AFFRA", "AIN CHENIA", "AIN CHERCHAR", "AIN DEFLA", "AIN DOUZ", "AIN EL BERD", "AIN ELHADJADJ", "AIN FEZZA",
            "AIN KECHERA", "AIN KECHRA", "AIN M LILA", "AIN NAADJA", "AIN NOUISSY", "AIN REGADA", "AIN ROUIBAH", "AIN SEFRA", "AIN SENNOUR", "AIN SERB",
            "AIN TAHMIMINE", "AIN TELLOUT", "AIN TORKI", "AIN TOUTA", "AIN YAGOUT", "AIN-TEMOUCHENET", "AIN.BOUZIANE", "AIN.EL HADJAR", "AIN_BEIDA", "AIN_FEKROUN",
            "AIN_MLILA", "AIN_TOUTA", "AIN_YAGOUT", "AKBOU", "AKID ABBAS", "ALGER", "ALLAGHAN", "ANNABA", "ARBAL", "ARIBS",
            "ARRET RAOUX", "ATELIERS", "AYATA", "AZIB-BEN-ALI-CHERIF", "AZZABA", "B.ES SOUANI", "B.MENAIEL", "B.OUASSINE", "BAB EZZOUAR", "BABA ALI",
            "BARIKA", "BATNA", "BAZOUL", "BECHAR", "BECHLOULE EL ADJIBA", "BEJAIA", "BEKIRA", "BEL-LMOUR", "BEN BADIS", "BENI AMRANE",
            "BENI MANSOUR", "BENI MERED", "BENI OUNIF", "BENZIREG", "BERHOUM", "BERRAHAL", "BHEIR_CHERGUI", "BIR DJED EL KBIR", "BIR DJEIFER", "BIR EL ARCH",
            "BIR EL ATER", "BIR SAF SAF", "BIR SBEIKIA", "BIR SENIA", "BIR-A", "BIRTOUTA", "BIR_ROGAA", "BISKRA", "BLIDA", "BORDJ BOU ARRERIDJ",
            "BOU AICH", "BOU HENNI", "BOU MEDFAA", "BOU-RACHED", "BOUCHEGOUF", "BOUDAROUA", "BOUDOUAOU", "BOUFARIK", "BOUGHELLABA", "BOUGTOB",
            "BOUHANIFIA", "BOUIRA", "BOUKADIR", "BOUKHADRA", "BOUKHALFA", "BOUKHAMOUZA", "BOUKHANIFIS", "BOULHAF DYR", "BOUMAHRA", "BOUMERDES",
            "BOUNOUARA", "BOUTLELIS", "BREDEAH", "B_B_A", "C.BEN YAHIA", "C.EL LEHAM", "CAROUBIER", "CHAIBA", "CHALET DES PINS", "CHEBAITA M",
            "CHELGHOUM EL A", "CHIFFA", "CHIHANI BACHIR", "CHLEF", "CONSTANTINE", "CORSO", "D.B.KHEDDA", "D.BOU REZG", "D.EL KERCH", "DAHMOUNI",
            "DAR AROUS", "DAR EL BEIDA", "DEBROUSSEVILLE", "DHAKARA", "DIDOUCH MOURAD", "DJAMAA", "DJBEL ONK", "DJENIENE MESKINE", "DJERMA", "DJIDIOUIA",
            "DRA EL MIZAN", "DRAA ES SAA", "DREA", "DREAN", "EAUX CHAUD.", "EL .MA. ABIOD", "EL AFFROUN", "EL AMRA", "EL AMRIA", "EL ANASSER",
            "EL ANCER", "EL AOUINET", "EL ARFIANE", "EL ATTAF", "EL BEIDA", "EL BERD", "EL BIOD", "EL ESNAM", "EL GHOMRI", "EL GOURZI",
            "EL HADJAR", "EL HAMRI", "EL HARCHAIA", "EL HARRACH", "EL HARROUCH", "EL KANTARA", "EL KERMA", "EL KHROUB", "EL KOUIF", "EL MALAH",
            "EL MATMAR", "EL MEGHAIER", "EL MELAH", "EL MERDJA", "EL MILIA", "EL MOUHAD", "EL OUTAYA", "EL-ACHIR", "EL-EULMA", "EL-HAMMAM",
            "EL-KSEUR-OUED-AMIZOUR", "EL_GHOURZI", "EL_KHROUB", "EL_KHROUB OAIC", "EMDJEZ.EDCHICHE", "ES SENIA", "FAIDHERBE", "FERGOUGVILL", "FERME BLANCHE", "FORNAKA",
            "FROHA", "GARITA", "GDYEL", "GHADJATI", "GHARD_FR", "GHASROU", "GHAZAOUET", "GHDIR SAFIA", "GHRISS", "GUE DE CONSTANTINE",
            "GUELMA", "GUIDJIL", "GUINGUITA", "H EL HOUARI", "H.EL GHELLA", "H.EL MADANI", "H.EL MEGUIL", "HACINE", "Hadj Lakhder Universit\351", "HADJAR SOUD",
            "HADJARET M", "HAI EL SABAH", "HAMMA.BOUZIANE", "HAMMADI K", "HANCHIR_TOUMGHARI", "HANIF", "HASSI AMEUR", "HASSI BEN OKBA", "HASSI BOUNIF", "HASSI LAMECHE",
            "HASSI MAFSOUKH", "HASSI ZAHANA", "HKAIBA", "HOCEINA", "HOUCEINIA", "HUSSEIN DEY", "IGHZER-AMOKRAN", "IL MATEN", "IMAMA", "ISSERS",
            "JIJEL", "KADIRIA", "KEF NAAJA", "KEF SALAH", "KENENDA V.", "KHEDARA", "KHEMIS.MILLIANA", "KRALFALLAH", "KREBAZZA", "KREIDER",
            "LA GUETNA", "LAKHDARIA", "LE BARRAGE", "LES FERMES", "LES PINS", "LOTTA", "M'DAOUROUCH", "M'DJEZ", "M'SILA", "M'ZITA-EL-MCHIR",
            "M.BABA ALI", "M.BOUBEKEUR", "MAAFA", "MADROUMA", "MAGHNIA", "MAGRA", "MAHDIA", "MAKEDRA", "MAKESSA", "MANSOURAH",
            "MARE D EAU", "MASCARA", "MAZAGRAN", "MECHERIA", "MECHRAA SFA", "MECHROHA", "MEDJEZ SFA", "MEGGARINE", "MEKALIS", "MELIANA",
            "MENDES", "MENMBAA EL GHAZAL", "MERIRES", "MESKIANA", "MESLOUG", "MISSERGHINE", "MODZBAH", "MOGGAR", "MOGHRAR", "MOHAMMADIA",
            "MOHAMMADIA V.N", "MOHGOUN", "MOKTADELI", "MORSOTT", "MOSTAGANEM", "MOUDROU", "MOULEY AEK", "MOUZAIA", "N.SIGHA", "NAAMA",
            "NACIRIA", "NADOR", "NEDROMA", "O. RAMLA", "O.EL DJEMAA", "O.ES SALAM", "OAIC KHROUB", "OGGAZ", "ORAN", "OUED AISSI",
            "OUED CHOUK", "OUED CHOULY", "OUED DAB", "OUED DAMOUS", "OUED DJEMAA", "OUED DJER", "OUED FODDA", "OUED FRARAH", "OUED GHIR", "OUED HAMIMINE",
            "OUED KEBRIT", "OUED MOUGRAS", "OUED RHIOU", "OUED SLY", "OUED SMAR", "OUED TINN", "OUED TLELAT", "OUED ZENATI", "OUED ZIED", "OUED ZITOUN",
            "OUED-ALI", "OUED_AMMAR", "OUELD RAHMOUN", "OUENZA", "OUL.ED MIMOUN", "OULED DHIA", "OULED ZID", "OULED ZOUAI", "OULED-YELLES", "OULED_ABDELLA",
            "OULED_RAHMOUN", "OULED_ZOUAI", "OULMANE", "OUMACHE", "OUM_BOUAGHI", "OURIR", "PASTEUR", "PORTE DE FER", "R DEMOUCHE", "R DJAMEL",
            "RAHOUIA", "RAS EL MA", "RAS EL OUED", "REBAHIA", "REGHAIA", "REGHAIA INDUSTRIEL", "RELIZANE", "REZAINIA", "RHILANE", "RIVIERE",
            "ROUIBA", "ROUIBA INDUSTRIEL", "ROUINA", "S ALI BYOUB", "S BOUABBIDA", "S LAHCENE", "S LAKHDAR", "S MEDJAHED", "S SLISSEN", "S.ABDELAZIZ",
            "S.B.ABBES", "S.BOUCHAOUR", "S.E.HEMISSI", "S.MEZGHICHE", "SAF SAF", "SAF SAF O", "SAHKI AHMED", "SAHOURIA", "SAIDA", "SEBRA",
            "SEDJERMA", "SEFALOU", "SEGGANA", "SELMANE", "SETIF", "SETTARA", "SI MUSTAPHA", "SIDI ACHOUR", "SIDI AICH", "SIDI ALI",
            "SIDI AMAR", "SIDI BADER", "SIDI BRAHIM", "SIDI HAMADOUCHE", "SIDI KHALED", "SIDI KHELIL", "SIDI MAAMAR", "SIDI MABROUK", "SIDI MAROUF", "SIDI MDJAHED",
            "SIDI MEBROUK", "SIDI YAHIA", "SIG", "SKIKDA", "SOUIGA", "SOUK AHRAS", "SOUK-EL-HAD", "STIL", "T. EL RELEM", "TABIA",
            "TADJENANET", "TADMAIT", "TAFRAOUA", "TAGDEMT", "TAKOUKA", "TAKRIETS-SEDDOUK", "TAMALOUS", "TAMARIN", "TAMERNA", "TARIA",
            "TARJA", "TAZMALT", "TEBESSA", "TELEGMA", "TEMOUCHENT", "TENOUKLA", "THENIA", "TIARET", "TIDJELABINE", "TIN BRAHIM",
            "TIOUT", "TIRKOUNT", "TITEN YAHIA", "TIZI", "TIZI OUZOU", "TLEMCEN", "TOGHZA", "TOUGGOURT", "TOUIFZA", "TOUZLINE",
            "TRALIMET", "TUILLERIES", "UNIVERSIT\351", "YALOU", "YELLEL", "ZAHANA", "ZELBOUN", "ZEMMOURA", "ZIGHOUT Y", "ZIT EMBA",
            "ZOUBIA"
    };
    public static final String GARES_IDS[] = {
            "37", "38", "39", "40", "41", "42", "43", "44", "34", "45",
            "46", "466", "48", "49", "66", "50", "51", "52", "53", "54",
            "55", "56", "57", "58", "59", "451", "35", "36", "61", "62",
            "63", "64", "65", "67", "68", "69", "70", "71", "72", "73",
            "74", "75", "76", "77", "78", "79", "80", "81", "83", "84",
            "85", "86", "87", "88", "89", "90", "91", "92", "93", "94",
            "95", "96", "97", "99", "100", "101", "102", "103", "104", "105",
            "106", "107", "108", "109", "111", "112", "110", "113", "114", "115",
            "116", "117", "118", "136", "119", "120", "121", "122", "123", "124",
            "125", "126", "127", "128", "129", "130", "131", "132", "133", "134",
            "135", "137", "138", "82", "139", "140", "141", "142", "443", "143",
            "144", "145", "146", "147", "148", "149", "150", "151", "152", "153",
            "154", "155", "156", "157", "440", "158", "159", "450", "160", "161",
            "162", "163", "164", "165", "166", "167", "168", "169", "170", "171",
            "172", "173", "174", "175", "176", "177", "178", "179", "180", "181",
            "182", "183", "184", "185", "186", "187", "188", "189", "190", "191",
            "192", "193", "194", "195", "196", "197", "198", "201", "202", "203",
            "204", "199", "200", "469", "205", "206", "207", "208", "209", "210",
            "211", "468", "462", "212", "213", "214", "215", "216", "217", "218",
            "219", "220", "221", "222", "224", "225", "226", "227", "441", "228",
            "229", "457", "223", "230", "231", "232", "460", "461", "459", "233",
            "463", "234", "235", "236", "447", "237", "238", "239", "453", "240",
            "241", "243", "445", "244", "245", "246", "242", "247", "248", "249",
            "250", "251", "252", "253", "254", "255", "269", "270", "294", "295",
            "256", "257", "259", "455", "260", "261", "262", "263", "264", "265",
            "266", "267", "268", "271", "272", "273", "274", "275", "276", "448",
            "277", "278", "279", "280", "281", "282", "283", "284", "285", "286",
            "287", "464", "288", "289", "290", "291", "292", "293", "296", "297",
            "298", "299", "300", "301", "302", "303", "442", "304", "305", "446",
            "306", "307", "308", "309", "310", "311", "312", "313", "314", "315",
            "316", "317", "318", "319", "320", "321", "322", "323", "324", "454",
            "326", "325", "327", "328", "329", "330", "331", "332", "336", "333",
            "334", "335", "337", "339", "338", "340", "452", "341", "342", "343",
            "344", "345", "346", "347", "348", "439", "349", "350", "351", "352",
            "353", "438", "354", "355", "356", "357", "358", "359", "360", "361",
            "362", "363", "364", "365", "366", "367", "368", "369", "370", "371",
            "372", "373", "374", "375", "376", "377", "378", "465", "379", "380",
            "381", "382", "383", "384", "385", "386", "387", "390", "458", "449",
            "388", "389", "392", "393", "394", "395", "396", "397", "398", "399",
            "400", "401", "402", "403", "467", "404", "405", "406", "407", "408",
            "409", "410", "411", "412", "413", "414", "415", "416", "417", "418",
            "419", "420", "421", "422", "423", "424", "444", "425", "426", "427",
            "428", "429", "456", "430", "431", "432", "433", "434", "435", "436",
            "437"
    };
    private String id;
    private String nom;

    public Gare()
    {
    }

    public String getId()
    {
        return id;
    }

    public String getNom()
    {
        return nom;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setNom(String s)
    {
        nom = s;
    }
}
