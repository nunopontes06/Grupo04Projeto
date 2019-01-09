package com.example.nuno.grupo04projeto;

import android.support.annotation.NonNull;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

/*Declaramos algumas variaveis para podermos obter o valor da interface*/

public class RegisterActivity extends AppCompatActivity {

    /*EditText ufirstname, ulastname, uemail, upassword, uconfpassword, ucontactno;
    Button btnRegister;
    TextInputLayout userFirstNameWrapper, userLastNameWrapper, userEmailWrapper,
            userConfPasswordWrapper, userPasswordWrapper, userContactNoWrapper;*/


    /*private FirebaseAuth mAuth;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

    }

}


        /*mAuth=FirebaseAuth.getInstance();
        ufirstname=findViewById(R.id.userFirstName);
        ulastname=findViewById(R.id.userLastName);
        uemail=findViewById(R.id.userEmailAddress);
        upassword=findViewById(R.id.userPassword);
        uconfpassword=findViewById(R.id.userConfPassword);
        ucontactno=findViewById(R.id.userContactNumber);

        /*userFirstNameWrapper=findViewById(R.id.userFirstNameWrapper);
        userLastNameWrapper=findViewById(R.id.userLastNameWrapper);
        userEmailWrapper=findViewById(R.id.userEmailWrapper);
        userPasswordWrapper=findViewById(R.id.userPasswordWrapper);
        userConfPasswordWrapper=findViewById(R.id.userConfPasswordWrapper);
        userContactNoWrapper=findViewById(R.id.userContactNoWrapper);

        btnRegister=findViewById(R.id.btnRegister);
        }

        /*btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        /*btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mAuth.getCurrentUser() !=null)
                {

                    o utilizador esta com sessao iniciada e pode ser redirecionado para outra actividade.



                }else {


                    final String firstname = ufirstname.getText().toString().trim();
                    final String lastname = ulastname.getText().toString().trim();
                    final String email = uemail.getText().toString().trim();
                    String password = upassword.getText().toString().trim();
                    String confpassword = uconfpassword.getText().toString().trim();
                    final String contactno = ucontactno.getText().toString().trim();

                    vamos validar nesta funcao se os campos estao vazios antes de passar de uma laber a proxima

                    if (firstname.isEmpty()) {
                        userFirstNameWrapper.setError("Introduza o primeiro nome");
                        userFirstNameWrapper.requestFocus();
                        return;
                    }
                    if (lastname.isEmpty()) {
                        userLastNameWrapper.setError("Introduza o ultimo nome");
                        userLastNameWrapper.requestFocus();
                        return;
                    }
                    if (email.isEmpty()) {
                        userEmailWrapper.setError("Introduza o email");
                        userEmailWrapper.requestFocus();
                        return;
                    }
                    if (password.isEmpty()) {
                        userPasswordWrapper.setError("Introduza a password");
                        userPasswordWrapper.requestFocus();
                        return;
                    }
                    if (confpassword.isEmpty()) {
                        userConfPasswordWrapper.setError("Confirme a password");
                        userConfPasswordWrapper.requestFocus();
                        return;
                    }
                    if (!password.equals(confpassword)) {
                        userConfPasswordWrapper.setError("A password esta incorrecta");
                        userConfPasswordWrapper.requestFocus();
                        return;
                    }
                    if (contactno.isEmpty()) {
                        userContactNoWrapper.setError("Introduza o seu contacto");
                        userContactNoWrapper.requestFocus();
                        return;
                    }
                    mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){

                                Users user=new Users(firstname, lastname, email, contactno);

                                FirebaseDatabase.getInstance().getReference("Users")
                                        .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                        .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                    @Override
                                    public void onComplete(@NonNull Task<Void> task) {
                                        if(task.isSuccessful()){
                                            Toast.makeText(RegisterActivity.this, "Utilizador criado com sucesso", Toast.LENGTH_LONG);
                                        }else{

                                            Toast.makeText(RegisterActivity.this, task.getException().getMessage(), Toast.LENGTH_LONG);
                                        }
                                    }
                                });

                            }else{
                                Toast.makeText(RegisterActivity.this, task.getException().getMessage(), Toast.LENGTH_LONG);

                            }
                        }
                    });

                }

            }
        });*/


