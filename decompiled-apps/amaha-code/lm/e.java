package lm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.journal.activity.JournalParentActivity;
import com.theinnerhour.b2b.components.journal.model.JournalModel;
import com.theinnerhour.b2b.utils.Extensions;
import gv.n;
import hs.k;
import kotlin.jvm.internal.i;
import r1.b0;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f24440u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ JournalParentActivity f24441v;

    public /* synthetic */ e(JournalParentActivity journalParentActivity, int i6) {
        this.f24440u = i6;
        this.f24441v = journalParentActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013a  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        String str;
        String str2;
        boolean z10;
        String str3;
        tm.e eVar;
        String str4;
        JournalModel journalModel;
        JournalModel journalModel2;
        tm.a aVar;
        tm.a aVar2;
        tm.a aVar3;
        int i6 = this.f24440u;
        String str5 = null;
        boolean z11 = false;
        JournalParentActivity this$0 = this.f24441v;
        switch (i6) {
            case 0:
                int i10 = JournalParentActivity.C;
                i.g(this$0, "this$0");
                Intent intent = new Intent();
                intent.putExtra("draftEntrySavedInCurrSession", this$0.f11221z);
                k kVar = k.f19476a;
                this$0.setResult(0, intent);
                this$0.finish();
                String str6 = gk.a.f16573a;
                Bundle bundle = new Bundle();
                tm.e eVar2 = this$0.f11217v;
                if (eVar2 != null && (aVar = eVar2.A) != null) {
                    str = aVar.b();
                } else {
                    str = null;
                }
                bundle.putString("template", str);
                if (this$0.f11219x) {
                    str2 = "screen_back";
                } else {
                    str2 = "hard_back";
                }
                bundle.putString("source", str2);
                tm.e eVar3 = this$0.f11217v;
                if (eVar3 != null && eVar3.H) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (eVar3 != null) {
                        journalModel = eVar3.J;
                    } else {
                        journalModel = null;
                    }
                    if (journalModel != null) {
                        if (eVar3 != null && (journalModel2 = eVar3.J) != null) {
                            str3 = journalModel2.getId();
                        } else {
                            str3 = null;
                        }
                        bundle.putString("entry_id", str3);
                        eVar = this$0.f11217v;
                        if (eVar == null) {
                            str4 = eVar.L;
                        } else {
                            str4 = null;
                        }
                        if (!((str4 != null || n.B0(str4)) ? true : true)) {
                            str5 = str4;
                        }
                        if (str5 != null) {
                            bundle.putString("question_text", str5);
                        }
                        gk.a.b(bundle, "journal_exit_popup_yes");
                        return;
                    }
                }
                str3 = "fresh_entry";
                bundle.putString("entry_id", str3);
                eVar = this$0.f11217v;
                if (eVar == null) {
                }
                if (!((str4 != null || n.B0(str4)) ? true : true)) {
                }
                if (str5 != null) {
                }
                gk.a.b(bundle, "journal_exit_popup_yes");
                return;
            case 1:
                int i11 = JournalParentActivity.C;
                i.g(this$0, "this$0");
                Extensions extensions = Extensions.INSTANCE;
                ConstraintLayout parentNavBarTemplateContainer = (ConstraintLayout) this$0.n0(R.id.parentNavBarTemplateContainer);
                i.f(parentNavBarTemplateContainer, "parentNavBarTemplateContainer");
                if (extensions.isVisible(parentNavBarTemplateContainer)) {
                    ConstraintLayout parentNavBarTemplateContainer2 = (ConstraintLayout) this$0.n0(R.id.parentNavBarTemplateContainer);
                    i.f(parentNavBarTemplateContainer2, "parentNavBarTemplateContainer");
                    extensions.gone(parentNavBarTemplateContainer2);
                    ((AppCompatImageView) this$0.n0(R.id.parentNavBarInfoButton)).setImageResource(R.drawable.ic_journal_template_switch);
                    String str7 = gk.a.f16573a;
                    Bundle a10 = b0.a("source", "inside_entry");
                    tm.e eVar4 = this$0.f11217v;
                    if (eVar4 != null && (aVar3 = eVar4.A) != null) {
                        str5 = aVar3.b();
                    }
                    a10.putString("template", str5);
                    k kVar2 = k.f19476a;
                    gk.a.b(a10, "journal_template_sheet_close");
                    return;
                }
                View currentFocus = this$0.getCurrentFocus();
                if (currentFocus == null) {
                    currentFocus = new View(this$0);
                }
                Object systemService = this$0.getSystemService("input_method");
                i.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                ConstraintLayout parentNavBarTemplateContainer3 = (ConstraintLayout) this$0.n0(R.id.parentNavBarTemplateContainer);
                i.f(parentNavBarTemplateContainer3, "parentNavBarTemplateContainer");
                extensions.visible(parentNavBarTemplateContainer3);
                ((AppCompatImageView) this$0.n0(R.id.parentNavBarInfoButton)).setImageResource(R.drawable.ic_journal_template_close);
                String str8 = gk.a.f16573a;
                Bundle bundle2 = new Bundle();
                tm.e eVar5 = this$0.f11217v;
                if (eVar5 != null && (aVar2 = eVar5.A) != null) {
                    str5 = aVar2.b();
                }
                bundle2.putString("from_template", str5);
                k kVar3 = k.f19476a;
                gk.a.b(bundle2, "journal_template_icon");
                return;
            default:
                int i12 = JournalParentActivity.C;
                i.g(this$0, "this$0");
                this$0.f11219x = true;
                this$0.onBackPressed();
                return;
        }
    }
}
