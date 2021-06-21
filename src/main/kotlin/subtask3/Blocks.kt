package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {
    
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {

        if (blockB == String::class){
                var rezult = ""
            for(i in blockA){
                if (i is String){
                    rezult += i
                }
            }
            return  rezult
        }
        if (blockB == Int::class){
            var rezult = 0
            for (i in blockA){
                if (i is Int){
                   rezult +=i
                }
            }
            return rezult
        }

         if ( blockB == LocalDate::class) {
             var rezult = LocalDate.MIN
             for (i in blockA) {
                 if (i is LocalDate && i > rezult) rezult = i
             }
          return   rezult.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
         }
        return  "something"
    }
}
