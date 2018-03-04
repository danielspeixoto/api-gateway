package app.graphql

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class QueryResolver @Autowired constructor() : GraphQLQueryResolver {

    fun hello()
            = "world"
}