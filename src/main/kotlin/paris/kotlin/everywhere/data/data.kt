package paris.kotlin.everywhere.data

data class Speaker(
    val id: String,
    val name: String,
    val company: String? = null,
    val description: String,
    val talks: List<String> = emptyList(),
    val featured: Boolean = false
)

data class Talk(
    val id: String,
    val title: String,
    val description: String,
    val language: String = "fr",
    val speakers: List<String>,
    val isWorkshop: Boolean = false
)

val speakers = listOf(
    Speaker(
        id = "dmitry-savvinov",
        name = "Dmitry Savvinov",
        company = "JetBrains",
        description = """
            I've made my first acquaintance with Kotlin Team in 2016 during "JetBrains Summer Internship", where I was a part of the team responsible for implementing a translator from Kotlin to LLVM and then using it to deploy simple Kotlin program onto Raspberry Pi controller. Sometimes  One could say that was one of the very first Kotlin/Native programs :) (though the translator itself was terrible, obviously). 
            From 2016 to 2017 I was writing a Master thesis together with Kotlin team, which results were used later as foundation for a language feature known now as Kotlin Contracts. In Kotlin Team, my main field of interest is compiler's frontend: code analysis, type inference, etc. Currently I'm actively working on improving multiplatform projects support in the compiler and IDE.            
        """.trimIndent(),
        talks = listOf("multiplatform-kotlin13"),
        featured = true
    ),
    Speaker(
        id = "geoffrey-metais",
        name = "Geoffrey Métais",
        company = "VideoLan",
        description = "Lead Android developer at VideoLAN and Videolabs.",
        talks = listOf("workshop-coroutines")
    ),
    Speaker(
        id = "louis-cad",
        name = "Louis CAD",
        description = "Android & Kotlin Dev. Efficiency before performance. Bike commuter, velomobile enthusiast.",
        talks = listOf("workshop-coroutines")
    ),
    Speaker(
        id = "romain-boisselle",
        name = "Romain Boisselle",
        company = "Kodein Koders",
        description = "Je suis un développeur backend depuis 8 ans, principalement en Java + Spring et freelance depuis un an, centré sur les architectures backend. Je suis tombé amoureux de Kotlin il y a 4 ans, et l'utilise réellement en production depuis deux ans dans des projets backend. Java ne sera bientôt plus qu'un souvenir :) Je suis également un père comblé, et adepte du zéro gaspillage.",
        talks = listOf("workshop-cloud")
    ),
    Speaker(
        id = "salomon-brys",
        name = "Salomon Brys",
        company = "Kodein Koders",
        description = "Passionné de Kotlin depuis que Kotlin il y a, Salomon est le fondateur de Kodein Koders et du Kodein Framework. Fortement implanté dans la philosophie Open-Source, il se dédie à la création de librairie et d'outils pour rendre la programmation plus facile, sure, et fun. Il est aussi addict aux jeux de sociétés, et adore piloter des avions de loisir.",
        talks = listOf("workshop-multiplatform")
    ),
    Speaker(
        id = "sebastien-deleuze",
        name = "Sébastien Deleuze",
        company = "Pivotal",
        description = "Sébastien est committer Spring Framework chez Pivotal. Il travaille principalement sur le support de Kotlin des différents projets Spring, ainsi que sur les sujets Web et Reactive. Il a créé le project Spring Fu et est également membre de l'équipe qui organise la conférence MiXiT.",
        talks = listOf("spring-kotlin"),
        featured = true
    )
).associateBy { it.id }

val talks = listOf(
    Talk(
        id = "multiplatform-kotlin13",
        title = "Multiplatform Programming in Kotlin 1.3",
        description = """
            Kotlin Multiplatform is a language feature which provides the ability to share and re-use common code across different platforms. The very first iteration was announced in Kotlin 1.2, and since then, multiplatform technology has greatly evolved.
            In this talk, we'll give a consistent, cumulative overview of the most recent features and changes in multiplatform projects support in Kotlin. Also, we'll explain why these changes were made and what new opportunities they unlock.
            The talk is well-suited both for beginners who want to get an introduction into technology, and for advanced users who want to hear latest news and insights about multiplatform programming in Kotlin.
        """.trimIndent(),
        language = "fr",
        speakers = listOf("dmitry-savvinov")
    ),
    Talk(
        id = "spring-kotlin",
        title = "Spring Boot avec Kotlin, Kofu et les Coroutines",
        description = """
            Cette présentation sera pour moi l'occasion de présenter le support officiel des Coroutines dans Spring (Framework, Boot, Data) ainsi que Kofu, la DSL Kotlin développée au sein de l'incubateur Spring Fu que j'ai créé il y a quelques mois et qui permet de configurer Spring Boot de manière explicite et encore plus performante.
            Mon live coding montrera comment développer une application Spring Boot avec Kofu en utilisant les nouvelles API Coroutines de WebFlux et Spring Data R2DBC (Reactive SQL). Nous comparerons également les API Reactive et Coroutines (avantages, inconvénients) pour vous aider à faire un choix en connaissance de cause.
        """.trimIndent(),
        language = "fr",
        speakers = listOf("sebastien-deleuze")
    ),
    Talk(
        id = "workshop-coroutines",
        title = "Les coroutines en détail",
        description = """
            Les coroutines sont la fonctionalité la plus importante introduite dans Kotlin depuis sa création. Vous avez probablement entendu dire que les coroutines facilitent l'asynchronicité et qu'elles permettent d'écrire ce type de code de manière impérative. Saviez vous que Kotlin fournit une implémentation bas niveau des coroutines très différente de la plupart des autres langages de programmation ?
            Dans ce workshop, nous vous proposons de découvrir les coroutines de Kotlin et d'approfondir sur leur spécificité et leurs possibilités. Nous commencerons par comprendre ce que sont exactement les coroutines et leurs utilisations synchrones et asynchrones. Nous verrons ensuite comment les utiliser dans un contexte multi-thread en fonction de nos besoins, et finirons par explorer des patterns architecturaux avancés comme le Reactive Functional Programming et l'Actor Based Programming, simplifé par les librairies haut-niveau (notamment kotlinx.coroutines).
            À travers cette matinée, nous créerons ensemble une petite application qui nous permettra de mettre en pratique notre progression dans l'univers des coroutines. Cette application pourra être à votre choix en ligne de commande ou sur Android. Le seul prérequis est de connaître au choix le langage Java ou le langage Kotlin.
        """.trimIndent(),
        language = "fr",
        speakers = listOf("geoffrey-metais", "louis-cad"),
        isWorkshop = true
    ),
    Talk(
        id = "workshop-multiplatform",
        title = "Kotlin multi platformes mobiles",
        description = """
            Grâce au langage Kotlin et à son outillage, nous pouvons créer des applications qui pour Android, iOS et le Web.
            Dans ce workshop nous verrons comment utiliser Kotlin pour réutiliser notre code métier à travers multiple platformes. Nous verrons comment définir l'architecture de notre applications, créer les abstractions nécéssaires pour obtenir un code réutilisables, comment tester ce code sur toutes ces platformes, et enfin comment le déployer.
            Grâce à une série d'exercices simples, nous créerons ensemble une application qui pourra être déployée sur chaque platforme, chacune conservant sa propre couche de présentation.
            Notez que bien qu'un MacBook est recommandé si vous souhaitez déployer sur iOS ; un PC sous linux ou windows vous permettra d'utiliser Kotlin/JVM, Kotlin/JS et Kotlin/Native.
        """.trimIndent(),
        language = "fr",
        speakers = listOf("salomon-brys"),
        isWorkshop = true
    ),
    Talk(
        id = "workshop-cloud",
        title = "Cloud moderne en Kotlin",
        description = """
            Dans ce workshop, nous verrons une nouvelle manière de coder des serveurs en Kotlin, grâce à une librarie développée par Jetbrains : Ktor, un framework permettant de créer un serveur entièrement asynchrone grâce à la puissance du langage Kotlin et de ses coroutines.
            Nous commencerons par présenter Ktor et ses utilisations les plus simples pour créer, en quelques lignes, un serveur simple permettant de servir une API et du contenu statique. Nous verrons ensuite comment utiliser certaines des fonctionalités plus avancées, notemment liées à la sécurité et aux systèmes complexes.
            Enfin, nous verrons comment intégrer d'autres librairies utilisant Kotlin et permettant d'architecturer notre code et facilitant grandement la gestion de notre base de données. En 3h30, vous aurez un serveur léger, puissant, lisible et sécurisé !
        """.trimIndent(),
        language = "fr",
        speakers = listOf("romain-boisselle"),
        isWorkshop = true
    )


).associateBy { it.id }
