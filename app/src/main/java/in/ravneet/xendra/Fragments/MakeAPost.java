package in.ravneet.xendra.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import in.ravneet.xendra.R;

/**
 * Created by ravneet on 16/10/17.
 */

public class MakeAPost extends Fragment {

    Button btn_post;
    ImageView iv_gallery;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.id.make_a_post,container,false);
    }
}
