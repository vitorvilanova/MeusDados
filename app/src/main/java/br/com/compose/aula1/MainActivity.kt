package br.com.compose.aula1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.compose.aula1.ui.theme.Aula1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Aula1Theme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    ExibeTelaVertical()
                }
            }
        }
    }
}

@Composable
fun ExibeTelaVertical()
{
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(all = 20.dp)
        .background(color = Color.White)
    )
    {
        Text(text = "Vitor Vilanova Pinto", style = TextStyle(color = Color.Black, fontSize = 20.sp, fontWeight = FontWeight.Bold))
        Text(text = "Desenvolvedor Mobile", modifier = Modifier.padding(bottom = 10.dp), fontWeight = FontWeight.Bold)
        Text(text = "Linkedin: vitor-vilanova-pinto", modifier = Modifier.padding(bottom = 10.dp), fontWeight = FontWeight.Bold)
        Text(text = "GitHub: vitorvilanova", modifier = Modifier.padding(bottom = 10.dp), fontWeight = FontWeight.Bold)
        Text(text = "Contato: +5511956526821", modifier = Modifier.padding(bottom = 10.dp), fontWeight = FontWeight.Bold)
        Text(text = "São Paulo - SP", modifier = Modifier.padding(bottom = 10.dp), fontWeight = FontWeight.Bold)
    }
}
