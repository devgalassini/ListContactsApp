package galassini.tecnology.modulo10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import galassini.tecnology.modulo10.adapter.ContactAdapter
import galassini.tecnology.modulo10.model.ContactInfo

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contacts = listOf(
            ContactInfo("André Felipe Nogueira", "(82) 98021-9571"),
            ContactInfo("Márcia Elza Cavalcanti", "(67) 97942-9155"),
            ContactInfo("Marcela Daiane Cardoso", "(67) 99416-6643"),
            ContactInfo("Julio José dos Santos", "(64) 99763-2237"),
            ContactInfo("Malu Amanda Mirella Fernandes", "(98) 96976-9048"),
            ContactInfo("Mário Luís Nicolas Lima", "(85) 97379-6453"),
            ContactInfo("José Pedro Vitor Lopes", "(63) 98920-7600"),
            ContactInfo("Elza Catarina Fabiana Moreira", "(95) 98237-1721"),
            ContactInfo("Elza Catarina Fabiana Moreira", "(88) 98749-5418"),
            ContactInfo("Matheus Diego Kevin da Luz", "(62) 98418-3558"),
            ContactInfo("Renata Sueli Hadassa Pires", "(99) 98487-2207"),
            ContactInfo("Bárbara Manuela Mariana Jesus", "(95) 99837-8374"),
            ContactInfo("Diego Kauê Hugo da Luz", "(21) 97204-0287"),
            ContactInfo("Calebe Caio Pedro Henrique Carvalho", "(18) 98586-4605"),
            ContactInfo("Noah Carlos Eduardo Rodrigo Caldeira", "(98) 96749-0308"),
            ContactInfo("Oliver Lorenzo Cavalcanti", "(79) 99396-5047"),
            ContactInfo("Isabelle Daiane Sabrina Sales", "(82) 97147-5736"),
            ContactInfo("Rosângela Fátima Nicole Ramos", "(54) 97972-4453"),
            ContactInfo("Fábio Joaquim Farias", "(83) 99512-3802"),
            ContactInfo("Enrico Luiz Luiz Araújo", "(65) 99473-4760"),
            ContactInfo("Tânia Ester Analu Nunes", "(47) 98615-6316"),
            // Adicione mais contatos conforme necessário
        )

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ContactAdapter(contacts)
    }
}
