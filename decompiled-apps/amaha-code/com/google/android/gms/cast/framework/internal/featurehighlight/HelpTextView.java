package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import com.theinnerhour.b2b.R;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
@Keep
/* loaded from: classes.dex */
public class HelpTextView extends LinearLayout {
    private TextView zza;
    private TextView zzb;

    @Keep
    public HelpTextView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static final void zza(TextView textView, CharSequence charSequence) {
        int i6;
        textView.setText(charSequence);
        if (true != TextUtils.isEmpty(charSequence)) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        textView.setVisibility(i6);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(R.id.cast_featurehighlight_help_text_header_view);
        textView.getClass();
        this.zza = textView;
        TextView textView2 = (TextView) findViewById(R.id.cast_featurehighlight_help_text_body_view);
        textView2.getClass();
        this.zzb = textView2;
    }

    @Keep
    public void setText(CharSequence charSequence, CharSequence charSequence2) {
        zza(this.zza, charSequence);
        zza(this.zzb, charSequence2);
    }

    @RecentlyNonNull
    @Keep
    public View asView() {
        return this;
    }
}
