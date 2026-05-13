package ec.edu.puce.githubclient.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ec.edu.puce.githubclient.ui.components.RepoItem

@Composable
fun RepoList(
    modifier: Modifier = Modifier
) {
    Column (
        modifier= modifier
    ){
        RepoItem(
            name = "Repositorio de Android ",
            description = "Repositorio creado en kotlin",
            avatarUrl = "https://ghicons.github.com/assets/images/blue/png/Admin%20mentoring.png",
            language = "Kotlin"
        )
        RepoItem(
            name = "Repositorio de Django ",
            description = "Repositorio creado en Python",
            avatarUrl = "https://ghicons.github.com/assets/images/blue/png/Admin%20mentoring.png",
            language = "Kotlin"
        )
        RepoItem(
            name = "Repositorio de IOs",
            description = "Repositorio creado en IOs",
            avatarUrl = "https://ghicons.github.com/assets/images/blue/png/Admin%20mentoring.png",
            language = "Kotlin"
        )
        RepoItem(
            name = "Repositorio de React",
            description = "Repositorio creado en kotlin",
            avatarUrl = "https://ghicons.github.com/assets/images/blue/png/Admin%20mentoring.png",
            language = "Kotlin"
        )

    }
}