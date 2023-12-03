package com.theinnerhour.b2b.utils;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class MascotAnimationUtils {
    AppCompatImageView mascot;
    ArrayList<Integer> mascotImageList = new ArrayList<>();
    int mascotPos = 0;
    int mastcotAnimationDuration = 50;
    Handler mascotHandler = new Handler();
    private final String TAG = getClass().getSimpleName();
    Runnable mascotRunnable = new Runnable() { // from class: com.theinnerhour.b2b.utils.MascotAnimationUtils.1
        @Override // java.lang.Runnable
        public void run() {
            int i6;
            try {
                if (MascotAnimationUtils.this.mascotImageList.size() == 0) {
                    return;
                }
                MascotAnimationUtils mascotAnimationUtils = MascotAnimationUtils.this;
                mascotAnimationUtils.mascot.setImageResource(mascotAnimationUtils.mascotImageList.get(mascotAnimationUtils.mascotPos).intValue());
                MascotAnimationUtils mascotAnimationUtils2 = MascotAnimationUtils.this;
                if (mascotAnimationUtils2.mascotPos + 1 >= mascotAnimationUtils2.mascotImageList.size()) {
                    i6 = 0;
                } else {
                    i6 = MascotAnimationUtils.this.mascotPos + 1;
                }
                mascotAnimationUtils2.mascotPos = i6;
                MascotAnimationUtils mascotAnimationUtils3 = MascotAnimationUtils.this;
                mascotAnimationUtils3.mascotHandler.postDelayed(mascotAnimationUtils3.mascotRunnable, mascotAnimationUtils3.mastcotAnimationDuration);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(MascotAnimationUtils.this.TAG, "exception mascot runnable", e10);
            }
        }
    };

    /* loaded from: classes2.dex */
    public interface MascotButtonInterface {
        void onMascotDismiss();
    }

    public Boolean initMascot(View view, String str, String str2, String str3, String str4, String str5, final MascotButtonInterface mascotButtonInterface) {
        try {
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, "error in initialising mascot", e10);
            ((RelativeLayout) view.findViewById(R.id.rl_mascot)).setVisibility(8);
        }
        if (ApplicationPersistence.getInstance().getBooleanValue(str)) {
            ApplicationPersistence.getInstance().setBooleanValue(str, false);
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.mascot);
            this.mascot = appCompatImageView;
            appCompatImageView.setImageResource(R.drawable.mascot_ih_full);
            ((RobertoTextView) view.findViewById(R.id.mascot_text_top)).setText(str3);
            ((RobertoTextView) view.findViewById(R.id.mascot_text_bottom)).setText(str4);
            final RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.rl_mascot);
            relativeLayout.setOnTouchListener(new View.OnTouchListener() { // from class: com.theinnerhour.b2b.utils.MascotAnimationUtils.2
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view2, MotionEvent motionEvent) {
                    return true;
                }
            });
            relativeLayout.setVisibility(0);
            RobertoButton robertoButton = (RobertoButton) view.findViewById(R.id.mascot_submit);
            robertoButton.setOnClickListener(new View.OnClickListener() { // from class: com.theinnerhour.b2b.utils.MascotAnimationUtils.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    relativeLayout.setVisibility(8);
                    MascotButtonInterface mascotButtonInterface2 = mascotButtonInterface;
                    if (mascotButtonInterface2 != null) {
                        mascotButtonInterface2.onMascotDismiss();
                    }
                }
            });
            robertoButton.setText(str5);
            final View findViewById = view.findViewById(R.id.ll_mascot_bottom);
            findViewById.setVisibility(4);
            this.mascot.setVisibility(4);
            new Handler().postDelayed(new Runnable() { // from class: com.theinnerhour.b2b.utils.MascotAnimationUtils.4
                @Override // java.lang.Runnable
                public void run() {
                    TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 180.0f, 0.0f);
                    translateAnimation.setDuration(500L);
                    translateAnimation.setFillAfter(false);
                    findViewById.startAnimation(translateAnimation);
                    findViewById.setVisibility(0);
                    MascotAnimationUtils.this.mascot.startAnimation(translateAnimation);
                    MascotAnimationUtils.this.mascot.setVisibility(0);
                }
            }, 700L);
            return Boolean.TRUE;
        }
        if (mascotButtonInterface != null) {
            mascotButtonInterface.onMascotDismiss();
        }
        return Boolean.FALSE;
    }
}
