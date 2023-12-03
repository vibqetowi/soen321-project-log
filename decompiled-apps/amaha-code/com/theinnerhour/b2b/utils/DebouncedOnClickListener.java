package com.theinnerhour.b2b.utils;

import android.view.View;
/* loaded from: classes2.dex */
public abstract class DebouncedOnClickListener implements View.OnClickListener {
    private static final long MIN_DELAY_MS = 1000;
    private static final String TAG = "DebouncedOnClickListener";
    private long mLastClickTime;

    public static View.OnClickListener wrap(final View.OnClickListener onClickListener) {
        return new DebouncedOnClickListener() { // from class: com.theinnerhour.b2b.utils.DebouncedOnClickListener.1
            @Override // com.theinnerhour.b2b.utils.DebouncedOnClickListener
            public void onSingleClick(View view) {
                onClickListener.onClick(view);
            }
        };
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long j10 = this.mLastClickTime;
        long currentTimeMillis = System.currentTimeMillis();
        this.mLastClickTime = currentTimeMillis;
        if (currentTimeMillis - j10 >= MIN_DELAY_MS) {
            onSingleClick(view);
        }
    }

    public abstract void onSingleClick(View view);
}
