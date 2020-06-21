package com.codecorp.felipelima.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listLocais;
    private String[] itens = {
            "Angra dos Reis", "Caldas Novas",
            "Campos do Jordão", "Costa do Sauípe",
            "Ilhéus", "Porto Seguro", "Tiradentes",
            "Praga","Santiago","Zurique","Caribe",
            "Buenos Aires","Budapeste", "Cancún","Aruba"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listLocais = findViewById(R.id.listLocais);

        //Cria adaptador para a lista
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),// esse é o contexto
                android.R.layout.simple_list_item_1, // esse é o layout que será utilizado para exibir a lista
                android.R.id.text1, // qual é o item dentro do layout anterior onde eu quero que a lista seja exibida
                itens //itens a serem exibidos
        );

        //Adiciona adaptador para a lista
        listLocais.setAdapter(adaptador);

        //Adiciona clique na lista
        listLocais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String valorSelecionado = listLocais.getItemAtPosition(i).toString();
                Toast.makeText(getApplicationContext(), valorSelecionado, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
