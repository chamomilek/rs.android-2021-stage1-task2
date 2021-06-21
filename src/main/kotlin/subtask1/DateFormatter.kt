package subtask1

import java.time.DateTimeException
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*


class DateFormatter
{
    fun toTextDay(day: String, month: String, year: String): String 
    {
        val date: LocalDate
        return try
        {
            date = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
            val formatter = DateTimeFormatter.ofPattern("dd MMMM, EEEE", Locale("Ru"))
              date.format(formatter)

        }
        catch (e: DateTimeException) 
        {
            "Такого дня не существует"
        }

    }

}
