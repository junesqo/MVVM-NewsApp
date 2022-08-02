package kg.junesqo.newsapp.db

import androidx.room.TypeConverter
import kg.junesqo.newsapp.models.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}