package com.moe.pushlibrary.activities;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.k;
import ss.a;
/* compiled from: MoEActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class MoEActivity$onCreate$4$shouldOverrideUrlLoading$1 extends k implements a<String> {
    final /* synthetic */ String $url;
    final /* synthetic */ MoEActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoEActivity$onCreate$4$shouldOverrideUrlLoading$1(MoEActivity moEActivity, String str) {
        super(0);
        this.this$0 = moEActivity;
        this.$url = str;
    }

    @Override // ss.a
    public final String invoke() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        str = this.this$0.tag;
        sb2.append(str);
        sb2.append(" shouldOverrideUrlLoading() : Url: ");
        sb2.append(this.$url);
        return sb2.toString();
    }
}
