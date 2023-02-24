package com.example.maquetado


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.BottomStart
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterStart
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.maquetado.ui.theme.MaquetadoTheme
import com.example.maquetado.ui.theme.Shapes


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaquetadoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
private  fun header(){


        Row (modifier = Modifier.padding(horizontal = Dp(30f), vertical = Dp(20f))){
            Image(painter = painterResource(id = R.drawable.logo), contentDescription = "Logo de Jordan",
                    Modifier.size(40.dp)
                )

            Spacer(modifier = Modifier.width(220.dp))
            
            Button(onClick = { }, colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Unspecified,
                contentColor = Color.Unspecified),

                ) {

                Image(painter = painterResource(id = R.drawable.hamburguesa), contentDescription = null,
                    modifier = Modifier
                        .width(40.dp)
                        .height(40.dp)
                    )
            }
        }
}
@Composable
private fun home(name: String){
    
    Column() {
        Spacer(modifier = Modifier.height(100.dp))


        Column(modifier = Modifier.align(CenterHorizontally)) {
         
            Text(
                text = "$name",
                color = MaterialTheme.colors.primary,
                fontFamily = androidx.compose.ui.text.font.FontFamily.Cursive,
            )

            Spacer(modifier = Modifier.height(40.dp))

            Box(){
                Image(painter = painterResource(id = R.drawable.home), contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .clip(RoundedCornerShape(40.dp))
                        .width(300.dp)
                        .height(250.dp))
                Text(
                    text = "Jordan 'why Not' Zero.4",
                    color = Color.White,
                    modifier = Modifier
                        .align(CenterStart)
                        .padding(horizontal = Dp(35f))
                )
                
                Row(modifier = Modifier.align(BottomStart)) {
                    Spacer(modifier = Modifier.width(30.dp))
                    button(
                        "Shop", Modifier.width(100.dp),  ButtonDefaults.buttonColors(
                            backgroundColor = Color.Unspecified,
                            contentColor = Color.White,

                            ),)

                   /* button(
                         "Shop", Modifier.width(100.dp),  ButtonDefaults.buttonColors(
                        backgroundColor = Color.Unspecified,
                        contentColor = Color.White,

                    ),)*/

                    /*button(
                        "Explore", Modifier.width(100.dp), ButtonDefaults.buttonColors(
                            backgroundColor = Color.Red,
                            contentColor = Color.White,

                        ), ButtonDefaults.buttonColors(
                            backgroundColor = Color.Red,
                            contentColor = Color.White,
                        )
                    )*/
                   /* Button(onClick = { /*TODO*/ }, shape = RoundedCornerShape(50.dp), modifier = Modifier.width(100.dp),
                            colors = ButtonDefaults.buttonColors(
                                backgroundColor = Color.Red,
                                contentColor = Color.White)
                        ) {
                        Text(text = "Shop")

                    }*/

                   /* Button(onClick = { /*TODO*/ }, shape = RoundedCornerShape(50.dp),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color.Unspecified,
                            contentColor = Color.White)
                    ) {
                        Text(text = "Explore")
                    }*/
                    Spacer(modifier = Modifier.height(80.dp))
                }
            }
        }
    }
}

@Composable
private  fun secccion(){

    Column() {
        Spacer(modifier = Modifier.height(450.dp))
        Row(modifier = Modifier.align(CenterHorizontally)) {
            Text(
                text = "The Latest & Greatest",
                color = MaterialTheme.colors.secondary
            )
            Spacer(modifier = Modifier.width(150.dp))
            Image(painter = painterResource(id = R.drawable.flecha), contentDescription = null,
            contentScale = ContentScale.Fit,
                modifier = Modifier.size(30.dp))
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(modifier = Modifier.align(CenterHorizontally)) {
            Image(painter = painterResource(id = R.drawable.conjunto), contentDescription = "conjunto",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clip(RoundedCornerShape(30.dp))
                    .width(170.dp)
                    .height(170.dp))

            Spacer(modifier = Modifier.width(10.dp))

            Image(painter = painterResource(id = R.drawable.calzado), contentDescription = "conjunto",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clip(RoundedCornerShape(30.dp))
                    .width(170.dp)
                    .height(170.dp))
        }
    }
}
@Composable
private fun button(texto: String, modifier:Modifier,  c: ButtonColors){

        Button(onClick = { /*TODO*/ }, modifier, ) {
            Text(text = "$texto")

        }

}



@Composable
fun Greeting() {
    Surface() { Image(painter = painterResource(id = R.drawable.conjunto), contentDescription = null,
        contentScale = ContentScale.Crop)

        header()
        home(name = "Home")
        secccion();

    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    MaquetadoTheme {

        Greeting()
    }
}