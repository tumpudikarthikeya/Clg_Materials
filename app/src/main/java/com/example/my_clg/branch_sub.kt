package com.example.my_clg
data class Diploma_Subject(val SubName :String,
               val mat_link :String,
               val pqp_link :String
)
val branches= mapOf(1 to "CME",
                                2 to "ECE",
                                3 to "EEE",
                                4 to "MECH",
                                5 to "CIVIL",
                                6 to "AI & ML")

val commonSubjects = mapOf( "eng" to Diploma_Subject("English","1CElnUVTXXN7xJceVKFeooG7uKfpVlw9U","1cK3aMhl6F8VKNR9pgbo7iiKnh78lGLn1"),
    "math-1" to Diploma_Subject("Engg \nMathematics –I","1lNNqPIprjb0VB3sY0eUbiU-tUkh9NwBF","1uewNF1adUWrR1yn_zZ6LVV7UVjNyPdPT"),
    "phy" to Diploma_Subject("Physics","1ZR5qpHeTkt-LZjFrTZd93atAPIuS4cMq","1wS8HqKpYNsMirXpU37meGAaBA5r5b8A2"),
    "che" to Diploma_Subject("Chemistry","1hIxTmSHKRqzKnV6PmenTGcBJYzFISojd","1jKNywS4FrZk3p8Rvfo1WLg8Pm6xuDMa3"),
    "math-2" to Diploma_Subject("Engg \nMathematics –II","1wxXVuuDGhMcIMr3xU5A9EnaVR6sknSys","1BTkYk8aJXboH-BkvAIA_8SArJ1oHqYhv"),
    "imst" to Diploma_Subject("Industrial Management &\nSmart Technologies","1F2STrNhm-g6JQ89H6itjtd-YSZxzpNTE","1HJg-nY7xfT6uJa2On9XQg-lgzqiljFrr"))


val AllData = mapOf(
    1 to mapOf( // cse
        1 to listOf( // 1st year
            commonSubjects["eng"],
            commonSubjects["math-1"],
            commonSubjects["phy"],
            commonSubjects["che"],
            Diploma_Subject("Computer Fundamentals","14Jo-2mfTnUdhRguh62KiOGVNVQHd_EB4","1CGpmUxzuW_K2NN8WnUiv9P5Z7s2vrQvJ"),
            Diploma_Subject("C LANGUAGE","1tc9oT2cblTeZyryPiA_WZfaRwZCOT9iZ","1lcxlrgErPXIN2AneIAzYPZJHqvb_mQnP")
        ),
        2 to listOf(
            commonSubjects["math-2"],
            Diploma_Subject("Digital Electronics &\nComputer Architecture","1FGwKbAY-Qokm0cXp6TD4_ZQ5fLHJAA9W","1Mb4nyGyYv7_-cVhSRIsQFSnsOum-jKOi"),
            Diploma_Subject("Operating Systems","1hcooW4SR84Ngzuz1NHwKh91mHw8GCrXr","1Di-PR7sYv9Fn-UkM2Rq8VK8-pB2t2O4y"),
            Diploma_Subject("Data Structures through C","1bPkiQnGcV9gxLOn_Ip_OVrdUCErjbwWf","1w1UJSMURlbu7Oyw-m7cx8uja4tqJy3LI\","),
            Diploma_Subject("DBMS","18tx5lKInb6eWGgnl_Q08meoOruJ7KFwN","1Tp1gMuiPaXHu6oEVmOa8w2cALvuJL2wz")
        ),
        3 to listOf(
            Diploma_Subject("CH & N","1d-SxpxFkNAjtRUC48fX5T95t8d21hyup","1iO1d4idblQ1KLMC-n1Ke5bDwRGXUeFhK"),
            Diploma_Subject("JAVA","1yGPRS2w5F5FFqQDA1FgnZTPKCHvNH5yA","1byCksdxTIqx_0JwcwzdlD0i-QskccVe9"),
            Diploma_Subject("Software Engineering","1Cpc1oqe36WusrYp-XLEZJzxWfCa5420F","1wrrj88fBQEhaNo7IWViFOpI51YXxZNhx"),
            Diploma_Subject("Microprocessors","1ATWBf6MerPu2dfraz-rTpg__c2xdwmaB","195p4ntLLy5bzsiqq452OUGOAMVu93_q7"),
            Diploma_Subject("Web Designing","1XOx1eRc4GCXGiF_3GHVUS5i0-2RY_6ab","1aEPopMpKiPV3eckJZOSEUl6wvaliu81v")

        ),
        4 to listOf(
            commonSubjects["imst"],
            Diploma_Subject(".NET Programming with C#","1HPS2S8sJjzwbKH7W5Zk2_9SNXdaIPWM_","1jGD-eVr6NbarmsLuIujIYPpmwpdgXDQU"),
            Diploma_Subject("System Administration","1SC_7KEczxYYKr5WX5t4py9KKulSoKJ7y","1norufX0z4DqwmhAoAAU-FOAj9fIaLmkU"),
            Diploma_Subject("Mobile Application\nDevelopment","1Z3f-5iBEI_yYaOn3yWXr2ElLpou6ZNXP","1kAQebU9WrWZaNwDjBkzq90hKpThZ7cAj"),
            Diploma_Subject("Advances in Computer\nTechnology","1fnl3mkyYHn3yflFMQLjnOwZ4j4-zYl-v","1kXJ2a-52cB6JfonRNEzjeCVZ3rP3A0-7")

        )
    ),
    2 to mapOf( //ece sub
         1 to listOf( //1st year
             commonSubjects["eng"],
             commonSubjects["math-1"],
             commonSubjects["phy"],
             commonSubjects["che"],
            Diploma_Subject("Electronic Devices & Power Supplies", "1WottAIn4V0fJnbdwe5KVch9PpCIPTvBE", "1poKNDnMd-dL9AWMd0RTayYCXB38QSw6N"),
            Diploma_Subject("Elements of Electrical Engineering", "18A3_bI5p2GadYC5tCKxPHvIU7XuvW6sU", "1bclyprp1rQqtLgw52tfpq3tnIzc4KkBG")
        ),
        2 to listOf(
            commonSubjects["math-2"],
            Diploma_Subject("Electronic Circuits", "1CBXyHQR50a-U8kZhjgrP1TPQjbsBE8SS", "1okNm0sko6y1Sk46YtDs9gL-7CZLI5MJa"),
            Diploma_Subject("Digital Electronics", "1FfvFuXsLJkD3ptLLhWPPzKDgpYvKxlKo", "1By3FseClrqAu-RL0HDxmc_qFKQZqWzKE"),
            Diploma_Subject("Analog and Digital Communication Systems", "1UaDo3RgOhD6-SP7EIX4OU2d7u8eQt3Mx", "1n5XWsw0Dz0JevevXo2u8-aWsXsh27p-8"),
            Diploma_Subject("Network Analysis", "1X520Xk5oSL1mqgMAUJ07MOP2PUhTo9pM", "1-HJXsJWuGczqNSs3WdfFJm-g-QjrOfDU")
        ),
        3 to listOf(
            Diploma_Subject("Linear ICs and Applications", "1a39ANwloCjt7Hz8Mj0co5DEplQJr_glH", "15jhNOnTke0ZIWUIJpVThDz9UCcvGXixP"),
            Diploma_Subject("Programming in C and MATLAB", "1xmwA0bXKjAomZO1-pG5dMMnGET9_thqa", "1pczZ0lJLwYzejxOZXw9ZbAGCnMDgoE3_"),
            Diploma_Subject("Microprocessors", "1C3KOUjSWAMbAa3ik19ovfFliD7G_fHzz", "1ptP1y1rb3wXwOTj2zrpvFfHFKGTREZhv"),
            Diploma_Subject("Electronic Measurements & consumer gadgets", "1W0U2G-a_7SoDpmQpA_g7-O5HClzR1GLe", "1aDf8SaRhvs6IwImqsEKSBsQztRNw1TOC"),
            Diploma_Subject("Microwave & Satellite Communication systems", "1ULu7YeToVUyYRi_-qm2SqhJmfx7Hx6Tc", "1VIe2gHIjSt1xoGzdA1DtQ4mia8RMADex")
        ),
        4 to listOf(
            commonSubjects["imst"],
            Diploma_Subject("Microcontrollers", "1NOuxsGCeyLMScrptNucu9_97JDemZzr9", "1qLlI8xQ1F0FLZflwyt61Jln8nLnVd9XR"),
            Diploma_Subject("Computer Hardware & Networking", "1BKE7zFZcGF7M9l4o38aFKWwcCSs6bsnH", "1HMqHGKrirZlmC7tPhS25SJknp9daIOqm"),
            Diploma_Subject("Optical & Mobile Communications", "1C3Ra6tLkdIutmDsdH3x6s-wV4AMgiJTy", "1AjJePrEz3zXQfhB9nXeoTLjUY5qtweA1"),
            Diploma_Subject("Industrial Electronics", "196joKDi3gxhXorNO3tfQUzgv2NBTjFq1", "15gpIvcnpcPuBXN3RSBU2Oecz8K3krwju")
        )
    ),
    3 to mapOf(//eee
        1 to listOf(
            commonSubjects["eng"],
            commonSubjects["math-1"],
            commonSubjects["phy"],
            commonSubjects["che"],
            Diploma_Subject("Electrical Engineering \n Materials", "1gzuiIa56qlr422LSJW2enTL-jZnyVdMT", "1wGECzXwJUMoWTjiOzhx-x6ajc0UY7Fx5"),
            Diploma_Subject("Basic Electrical Engineering", "1Gp4bNXOM_i7hV19e7FxV1XMWIPj5_k3k", "1fB7zZVpeor3_rqbwjUQOdnd8OUgUy-BT")
        ),
        2 to listOf(
            commonSubjects["math-2"],
            Diploma_Subject("D.C. machines & measuring instruments", "1s_-NQuuzIadOTK4s-JK1fOEAJL1PilDe", "1aKEG-D3zU91u4ChrvFW1K8ujSQhiwZO7"),
            Diploma_Subject("Electrical circuits", "1SpYewPQKJ-tlZRJvL0NTKQIVLcO9k9cf", "196d25_zddo8iLWPtRUEPnNyxhm7XWB-s"),
            Diploma_Subject("General mechanical engg", "1NHQjw9ryNHqNlR6DC6YP_X7uArQAzewA", "1V8vJMX-VKUHJ4vfReWhzsDPAcsvzIXHV"),
            Diploma_Subject("Electronics engg - I", "1MVPoKCSC7E_Nq-gREZQ0-P6CY7rRl-fy", "1X6ANS4n-D_VxjpJy58T4pDHlnHO1cFX8")
        ),
        3 to listOf(
            Diploma_Subject("A.C. machines - I", "12WGL3pQxGeQNrl1Q4RQ-j3VAQprYYgNS", "1QallDDerbTPWTNeI9WPVrUQMhf5naeCW"),
            Diploma_Subject("Powers stems - I G& P", "1CqxMGuMqwx-c8YsnBqKuNj5V24LXRw0X", "13AfS_o23MgenIWsQOFjKWmmVeQgYala_"),
            Diploma_Subject("Electrical utilization & traction", "1-R8Js8y2a5_MfBgFrIPxcQdxDacJ-MQ_", "1QWxa2wS1K5TE8ViSNeswAup0AVKUOwOM"),
            Diploma_Subject("Electrical installation & estimation", "1tt1LOel8-_qCQIBVmXeISVdk1wo5a4od", "1BNu_w1gFc52wahXLgekjMu2ZZ3SChSBs"),
            Diploma_Subject("Electronics Engg - II", "1iUcz9l86rS51VwNUKcxjHLUMBpeJo4iF", "1IyK64NZe1mB5FWdCjcTRcNjTOckmAYjk")
        ),
        4 to listOf(
            commonSubjects["imst"],
            Diploma_Subject("A.C. machines-II", "1UwtEL4syczL5l0NrJoFpMmCgTBsg6bfn", "1Fpv8HpJiGijpyLSof5jBBlstAwlpwPQY"),
            Diploma_Subject("Power s stems -II ,D & P", "1BG1kVr5cRMCuRf_Dwkuosevku_XS25K-", "1nQfk19W_a5bMiFRYtNxcJqUEO_uT7E2a"),
            Diploma_Subject("Power electronics & PLC", "1Lbyn8vPoG5SBuUEn33h3WSkvbu5b_AyC", "1CzGWmyt26AYlNk52sP_C5C7OSPC71s7A"),
            Diploma_Subject("Digital electronics & Micro controllers", "1GxnBeFF2FZCtApnsFODB68HkW_b0tlAF", "1Ciy2-YzJ62vNEbAG2MD20ZXmMEaDSTO1")
        )
    ),
    4 to mapOf(//mech
        1 to listOf(
            commonSubjects["eng"],
            commonSubjects["math-1"],
            commonSubjects["phy"],
            commonSubjects["che"],
            Diploma_Subject("Engineering Mechanics", "1fqlARJ7cmVpV_X-6QyjZRYyntLEFd-DT", "1FdB9zByV5fwwzJAX3khVcgpwhS2Br4Dc"),
            Diploma_Subject("Workshop Technology", "1EPrIfn9JHEhwZGkyYCGB0OF1r3dmTx01", "1INFHBCH_IgHNAQPc8vz_BG2XPngtuBex")
        ),
        2 to listOf(
            commonSubjects["math-2"],
            Diploma_Subject("Strength of Materials", "1gB8rO4Ns3zsoGt5GwkT93xGGQbJcIinp", "1tWwFytO9XWGRefq18bHQ709lc-jxx5xL"),
            Diploma_Subject("Thermal Engineering-I", "1n1YFGUhej2Hk-eDmZPqhwgSP8HGSaspU", "1t9APoWB2-UNHiGP50HHN81U4KUP53PF-"),
            Diploma_Subject("Production Technology-I", "1SzDvDCx8zPXj2iQk16MXEqM33Nkpm-Ce", "1NtY--nTPeceJ8Vt-KvUCXcWp7-BeBesH"),
            Diploma_Subject("Basic Electrical Engineering & Electronics", "1E4F5arfNQ-0tMl0gbUxx8eQR6SXTuC-c", "1UYaFuRfGaG8aSxP0Mu80rtelu0YWlY86")
        ),
        3 to listOf(
            Diploma_Subject("Engineering Materials", "19sN2LdUgSZDlBVz6e0PVT8su8-qPQWKf", "1qxy6-861w0Oeq245_yF4kUP_tkmwtg7k"),
            Diploma_Subject("Hydraulics and Fluid Power Control Systems", "1Z5lh0ykoDu7Y9D_TNdWgX6Fq5GGmnmAm", "1Tm4xe8bctNpmQrtMshaD32oyr0yyDKYe"),
            Diploma_Subject("Thermal Engineering II", "1lutrZS7Nxffe0rjc9oKiY_pyFpIQPjRu", "1SOrQPYjTc2J2H1Q-ei08N-myaiiSOcny"),
            Diploma_Subject("Production technology-II", "1Fu8SA0BWA2YwhGlEWaf6YTFODbXzhhqM", "1igCFC_arXQPvZ2gBvFDXqAnnR1J-Jqjv"),
            Diploma_Subject("Design of Machine Elements", "1ycAInZg6lXDaa89G1tfcTDKe6LrKBsID", "1yb8hXVFqS_hQr4aTQAECVuXusIpV_dFi")
        ),
        4 to listOf(
            commonSubjects["imst"],
            Diploma_Subject("Industrial Engineering - Estimating and Costing", "1iF3CxTrWnqF7FgbL0I2D7biC2MOmzqg8", "1Uf1A_rStfJ43UVIfBNmpGLkzn_nBvFwU"),
            Diploma_Subject("Refrigeration & Air-conditioning", "18YrqtJ8IcuG_pKL8i9Lt2MzlIKhMK1eF", "1nSo5Nnq_lsRoALJ1ohOiu04E3oRbTnBv"),
            Diploma_Subject("Energy sources & Power Plant Engineering", "1tSlBDcD9Tk-p_ZyCi6PqglFqUnPk4wLx", "1gVry4y-u6OwVbVqHWsNZoNLNnMra-8FQ" +
                    ""),
            Diploma_Subject("Computer Aided Manufacturing systems", "1wDQi3GtKO7aPdaRPE6qgqEU0vAs86e40", "1qyZX6GoTZWHpxdr9-4UF9Bd_PZb4Jr1N")
        )
    ),
    5 to mapOf( //civil
        1 to listOf(
            commonSubjects["eng"],
            commonSubjects["math-1"],
            commonSubjects["phy"],
            commonSubjects["che"],
            Diploma_Subject("Surveying — 1", "1UMjv_IGKKE9nCyaew3pglFai6X9F29Tr", "1b0cYdL7XBL8-JbvFmz2TCn62R4V-JDBM"),
            Diploma_Subject("Engineering Mechanics", "1fZcisTwjJ8pzeXAbtgEPZBop0oQ_jkGx", "1zevRkSkGLgBuj9zZNa9hFlXcN0f48Dzi")

        ),
        2 to listOf(
            commonSubjects["math-2"],
            Diploma_Subject("Strength of Materials & Theory of Structures", "1w9yF3Pa9YK2FzcUW5UCDVloW4EuLkyqz", "1naGaqYJb3moeupVnqXR2R3750ZmMnuL_"),
            Diploma_Subject("Hydraulics", "1iPl74-Cjx2G5biseW-HboP4OXpN5oPvf", "1TqiSwa2FY0BuhhDfiJ2UPP-fuvx220Sh"),
            Diploma_Subject("Surveying-II", "1wRAUFqs7K5Mk5qaVNJIoosKizqm3Uio0", "1muXmlyj3BITbF7lvWcozZBzM40WoUIAS"),
            Diploma_Subject("Construction Materials", "1ZNNAHgnEKSAUFX_Ey8KA9CdsdDx40t-R", "1sdHORwtYKqTBEiwnSRepNbGigOehnCtQ")
        ),
        3 to listOf(
            Diploma_Subject("Reinforced Concrete Structures", "1EilpgOcziNOuUoV_35KzUgdf21yd0I4H", "1W2cC0WegdPvNtOhsgLo1ucJhyxRHFWSv"),
            Diploma_Subject("Irrigation Engineering", "104R_d6P1-Qc9-40n3_JFgMaH2Mrvynky", "1EkqCqn2p2lXj1_z3kJYzZ53a6dkgPGrA"),
            Diploma_Subject("Quantity Surveying", "1YwcSQ7KbeuFrSxWC6WjUbxzdlxYI4y3K", "1yXVPFvyjTRyIOJe_FQWSRVwZgJryctMC"),
            Diploma_Subject("Transportation Engineering", "1-trzVrZ6feMD8NXRXmGwUORjjkpHjDh0", "1xHq2FYAfMlrjmHIpZhpJpCwE21W0utIw"),
            Diploma_Subject("Construction Practice", "1YwaP5LhHxltL0BI4xeytzif3L3Cl-oYn", "18Ht7cZ6H_gTIV-fszGwZ4Ev_1QnMzQ_7")
        ),
        4 to listOf(
            commonSubjects["imst"],
            Diploma_Subject("Construction Technology and Project Management", "15pumI_Vhvl9ECst67nvi7btshLoT6iU8", "1bt9KCA_kEqFi_g_dQ-oIY5_4mxisINUN"),
            Diploma_Subject("Environmental Engineering", "17RJ8IUOFIAxOC3Cy6N_ujWvvq63csk9Y", "1W80CgbuIdD2dOGfHLISblbNr1JH-ykKV"),
            Diploma_Subject("Geotechnical Engineering", "1QK0_VPYhBNFx3OgdojNiSfFvHs2s4_Ih", "1QItUBEl6kcAxaFL0GLpb6rRFlw_xohhs"),
            Diploma_Subject("Advanced Civil Engineering Technologies", "15pumI_Vhvl9ECst67nvi7btshLoT6iU8", "1bt9KCA_kEqFi_g_dQ-oIY5_4mxisINUN")
        )
    )

)