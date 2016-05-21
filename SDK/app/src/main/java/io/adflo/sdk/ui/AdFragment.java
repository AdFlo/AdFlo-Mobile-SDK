package io.adflo.sdk.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/**
 * @author Daniel Christopher
 */
public class AdFragment extends Fragment {
    private static final int WIDTH_STANDARD_BANNER = 320;
    private static final int HEIGHT_STANDARD_BANNER = 100;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Context context = getContext();
        RelativeLayout root = new RelativeLayout(context);
        AdFloWebView view = new AdFloWebView(getContext());

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);

        params.addRule(Gravity.CENTER_HORIZONTAL);

        root.setLayoutParams(params);
        root.addView(view);

        ViewGroup.LayoutParams adParams = view.getLayoutParams();
        adParams.height = HEIGHT_STANDARD_BANNER;


        return root;
    }
}