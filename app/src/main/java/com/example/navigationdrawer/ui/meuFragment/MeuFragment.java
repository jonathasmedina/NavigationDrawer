
package com.example.navigationdrawer.ui.meuFragment;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.navigationdrawer.MainActivity;
import com.example.navigationdrawer.R;
import com.example.navigationdrawer.Usuario;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MeuFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MeuFragment extends Fragment {


    private EditText editTextId_, editTextNome_, editTextEmail_;
    private Button btInserir_, btListar;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MeuFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MeuFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MeuFragment newInstance(String param1, String param2) {
        MeuFragment fragment = new MeuFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_meu, container, false);


        editTextId_ = view.findViewById(R.id.editTextId);
        editTextNome_ = view.findViewById(R.id.editTextNome);
        editTextEmail_ = view.findViewById(R.id.editTextEmail);
        btInserir_ = view.findViewById(R.id.buttonInsertUsuario);
        btListar = view.findViewById(R.id.buttonListarUsuarios);

        btListar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               List<Usuario> usuarioList =  MainActivity.myAppDatabase.myDao().listarUsuarios();

               String info = "";

               for(Usuario usuario: usuarioList){
                   info = info + "\n" + usuario.getNome();
               }

               AlertDialog.Builder janela = new AlertDialog.Builder(getContext());
               janela.setMessage(info);
               janela.setTitle("Informação");
               janela.show();

            }
        });

        btInserir_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Usuario usuario = new Usuario();

                usuario.setId(Integer.parseInt(editTextId_.getText().toString()));
                usuario.setNome(editTextNome_.getText().toString());
                usuario.setEmail(editTextEmail_.getText().toString());

                MainActivity.myAppDatabase.myDao().insertUsuario(usuario);

            }
        });



        return view;
    }
}