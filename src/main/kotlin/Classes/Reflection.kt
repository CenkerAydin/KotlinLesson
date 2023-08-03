package Classes

import java.lang.reflect.Field

class WallPaper{
    private var imageUrl:String="www.kekod.com"
    private var id:Int=1234
    private var type:Int=3
    private var width:Int=1920
    private var height:Int=1080
    private var isGif:Boolean=false
    private var previewUrl:String="www.kekodpreview.com"

}

fun main() {
    val wallPaper=WallPaper()

    val imageUrlField: Field=wallPaper.javaClass.getDeclaredField("imageUrl")
    val imageUrlFieldName=wallPaper.javaClass.declaredFields[0].name
    val imageUrlField2:Field=wallPaper.javaClass.getDeclaredField(imageUrlFieldName)
    imageUrlField.isAccessible=true
    imageUrlField2.isAccessible=true

    val imageUrlString =imageUrlField.get(wallPaper)
    val imageUrlString2=imageUrlField2.get(wallPaper)
    println(imageUrlString2)
    println(imageUrlString)

}