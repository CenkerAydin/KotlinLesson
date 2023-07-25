package Classes

data class News(
    val title:String="Title",
    val description:String,
    val hasMediaContent: Boolean,
    val mediaList:List<Media>
){
    val relatedNewsList:List<News> = arrayListOf()

    override fun toString(): String {
        return "return super.toString()"
    }
    fun log(){
        println("Title: $title, description: $description")
    }
}

class NewsData(
    val title:String="Title",
    val description:String,
    val hasMediaContent: Boolean,
    val mediaList:List<Media>
){
    val relatedNewsList:List<News> = arrayListOf()
    override fun toString(): String {
        return "News(title= " +this.title +", description=" +this.description+", hasMediaContent=" +this.hasMediaContent
    }

    fun copy(): NewsData{
        return  NewsData(title,description, hasMediaContent, mediaList)
    }
}

class Media

fun main() {
    val newsOne=News(
        title = "Yeni bir eğitim dönemi başladı.",
        description = "Eğitim dönemi yeni bir şekilde başladı",
        hasMediaContent= true,
        mediaList = arrayListOf()
    )

    val newsTwo=NewsData(
        title = "Yeni bir eğitim dönemi başladı.",
        description = "Eğitim dönemi yeni bir şekilde başladı",
        hasMediaContent= true,
        mediaList = arrayListOf()
    )

    val (title, description, hasMediaContent, mediaList)=newsOne //Descructturing declaration
    val (title3, description3, hasMediaContent3)=newsOne
    val (title4,description4)=newsOne


    newsOne.toString()
    newsOne.hashCode()

    val newsThree=newsOne.copy(description="Farklı description") //Data class kullanılarak
    val newsFour=News(  //Düz class kullanılarak
        title=newsOne.title,
        description = "Farklı description",
        hasMediaContent=newsOne.hasMediaContent,
        mediaList=newsOne.mediaList
    )
    newsOne.component1()

    newsOne.relatedNewsList
    newsOne.title

   // newsTwo.equals()
    newsTwo.toString()
    newsTwo.hashCode()
  //  newsTwo.copy()
  //  newsTwo.component1()
    println("Data Class toString: $newsOne")
    println("Class toString: $newsTwo")
}