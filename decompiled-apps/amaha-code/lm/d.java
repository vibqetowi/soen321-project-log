package lm;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.journal.activity.JournalParentActivity;
import com.theinnerhour.b2b.components.journal.model.JournalModel;
import gv.n;
import hs.k;
import kotlin.jvm.internal.i;
import nm.h;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f24435u = 1;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Dialog f24436v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ JournalParentActivity f24437w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Integer f24438x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ String f24439y;

    public /* synthetic */ d(Dialog dialog, JournalParentActivity journalParentActivity, Integer num, String str) {
        this.f24436v = dialog;
        this.f24437w = journalParentActivity;
        this.f24438x = num;
        this.f24439y = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h hVar;
        String str;
        boolean z10;
        String str2;
        JournalModel journalModel;
        JournalModel journalModel2;
        tm.a aVar;
        String str3;
        JournalModel journalModel3;
        JournalModel journalModel4;
        tm.a aVar2;
        int i6 = this.f24435u;
        String str4 = "fresh_entry";
        String str5 = null;
        Integer num = this.f24438x;
        String analyticSource = this.f24439y;
        Dialog templateChangeDialog = this.f24436v;
        JournalParentActivity this$0 = this.f24437w;
        boolean z11 = false;
        switch (i6) {
            case 0:
                int i10 = JournalParentActivity.C;
                i.g(this$0, "this$0");
                i.g(templateChangeDialog, "$templateChangeDialog");
                i.g(analyticSource, "$analyticSource");
                if (num != null) {
                    JournalParentActivity.z0(num.intValue());
                    this$0.y0(num.intValue());
                } else {
                    Intent intent = new Intent();
                    intent.putExtra("draftEntrySavedInCurrSession", this$0.f11221z);
                    k kVar = k.f19476a;
                    this$0.setResult(0, intent);
                    this$0.finish();
                }
                templateChangeDialog.dismiss();
                String str6 = gk.a.f16573a;
                Bundle bundle = new Bundle();
                tm.e eVar = this$0.f11217v;
                if (eVar != null && (aVar2 = eVar.A) != null) {
                    str3 = aVar2.b();
                } else {
                    str3 = null;
                }
                bundle.putString("template", str3);
                bundle.putString("source", analyticSource);
                tm.e eVar2 = this$0.f11217v;
                if (eVar2 != null && eVar2.H) {
                    z11 = true;
                }
                if (z11) {
                    if (eVar2 != null) {
                        journalModel3 = eVar2.J;
                    } else {
                        journalModel3 = null;
                    }
                    if (journalModel3 != null) {
                        str4 = (eVar2 == null || (journalModel4 = eVar2.J) == null) ? null : journalModel4.getId();
                    }
                }
                bundle.putString("entry_id", str4);
                k kVar2 = k.f19476a;
                gk.a.b(bundle, "journal_draft_save_popup_no");
                return;
            default:
                int i11 = JournalParentActivity.C;
                i.g(templateChangeDialog, "$templateChangeDialog");
                i.g(this$0, "this$0");
                i.g(analyticSource, "$analyticSource");
                TextView textView = (TextView) templateChangeDialog.findViewById(R.id.tvJournalDialogYes);
                if (textView != null) {
                    textView.setTextColor(g0.a.b(this$0, R.color.amahaTerracota));
                }
                View findViewById = templateChangeDialog.findViewById(R.id.ldJournalDialogYesLoading);
                if (findViewById != null) {
                    findViewById.setVisibility(0);
                }
                if (num != null) {
                    JournalParentActivity.z0(num.intValue());
                }
                Fragment E = this$0.getSupportFragmentManager().E(R.id.root_frame_layout);
                if (E instanceof h) {
                    hVar = (h) E;
                } else {
                    hVar = null;
                }
                if (hVar != null) {
                    hVar.F(num);
                }
                this$0.f11220y = templateChangeDialog;
                String str7 = gk.a.f16573a;
                Bundle bundle2 = new Bundle();
                tm.e eVar3 = this$0.f11217v;
                if (eVar3 != null && (aVar = eVar3.A) != null) {
                    str = aVar.b();
                } else {
                    str = null;
                }
                bundle2.putString("template", str);
                bundle2.putString("source", analyticSource);
                tm.e eVar4 = this$0.f11217v;
                if (eVar4 != null && eVar4.H) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (eVar4 != null) {
                        journalModel = eVar4.J;
                    } else {
                        journalModel = null;
                    }
                    if (journalModel != null) {
                        str4 = (eVar4 == null || (journalModel2 = eVar4.J) == null) ? null : journalModel2.getId();
                    }
                }
                bundle2.putString("entry_id", str4);
                tm.e eVar5 = this$0.f11217v;
                if (eVar5 != null) {
                    str2 = eVar5.L;
                } else {
                    str2 = null;
                }
                if (!((str2 == null || n.B0(str2)) ? true : true)) {
                    str5 = str2;
                }
                if (str5 != null) {
                    bundle2.putString("question_text", str5);
                }
                k kVar3 = k.f19476a;
                gk.a.b(bundle2, "journal_draft_save_popup_yes");
                return;
        }
    }

    public /* synthetic */ d(Integer num, JournalParentActivity journalParentActivity, Dialog dialog, String str) {
        this.f24438x = num;
        this.f24437w = journalParentActivity;
        this.f24436v = dialog;
        this.f24439y = str;
    }
}
