package ir.meteornetwork;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SignUpFragment extends Fragment {

    private EditText username, password, full_name, email;
    private Button btn_sign_up;
    private TextView lbl_login;

    public SignUpFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_sign_up, container, false);
        username = v.findViewById(R.id.username);
        password = v.findViewById(R.id.password);
        email = v.findViewById(R.id.email);
        full_name = v.findViewById(R.id.full_name);
        btn_sign_up = v.findViewById(R.id.btn_sign_up);
        lbl_login = v.findViewById(R.id.lbl_login);

        btn_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        lbl_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return v;
    }

}
