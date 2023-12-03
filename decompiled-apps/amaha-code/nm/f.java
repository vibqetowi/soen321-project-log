package nm;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.journal.model.JournalModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ss.l;
/* compiled from: JournalListFragment.kt */
/* loaded from: classes2.dex */
public final class f extends k implements l<JournalModel, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ d f26412u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar) {
        super(1);
        this.f26412u = dVar;
    }

    @Override // ss.l
    public final hs.k invoke(JournalModel journalModel) {
        String str;
        RobertoTextView robertoTextView;
        final JournalModel journalModel2 = journalModel;
        if (journalModel2 != null) {
            int i6 = d.F;
            final d dVar = this.f26412u;
            um.c K = dVar.K();
            Context requireContext = dVar.requireContext();
            i.f(requireContext, "requireContext()");
            K.getClass();
            Dialog f = um.c.f(requireContext);
            dVar.B = f;
            RobertoTextView robertoTextView2 = (RobertoTextView) f.findViewById(R.id.tvJournalDialogCancel);
            if (robertoTextView2 != null) {
                robertoTextView2.setOnClickListener(new View.OnClickListener() { // from class: nm.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        View view2;
                        String str2;
                        RobertoTextView robertoTextView3;
                        String str3;
                        int i10 = r3;
                        JournalModel model = journalModel2;
                        d this$0 = dVar;
                        switch (i10) {
                            case 0:
                                int i11 = d.F;
                                i.g(this$0, "this$0");
                                i.g(model, "$model");
                                String str4 = gk.a.f16573a;
                                Bundle bundle = new Bundle();
                                bundle.putString("entry_id", model.getId());
                                bundle.putLong("user_entered_date", model.getUserEnteredDate());
                                bundle.putBoolean("is_favourite", model.isFavourite());
                                String templateType = model.getTemplateType();
                                i.g(templateType, "templateType");
                                if (i.b(templateType, "regular")) {
                                    str3 = "free_text_journal";
                                } else if (i.b(templateType, "question")) {
                                    str3 = "question";
                                } else if (i.b(templateType, Constants.GOAL_TYPE_THOUGHT)) {
                                    str3 = "thought_journal";
                                } else if (!i.b(templateType, "arc")) {
                                    str3 = "";
                                } else {
                                    str3 = "arc";
                                }
                                bundle.putString("template", str3);
                                bundle.putBoolean("is_draft", true);
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle, "journal_delete_popup_no");
                                Dialog dialog = this$0.B;
                                if (dialog != null) {
                                    dialog.dismiss();
                                    return;
                                }
                                return;
                            default:
                                int i12 = d.F;
                                i.g(this$0, "this$0");
                                i.g(model, "$model");
                                Dialog dialog2 = this$0.B;
                                if (dialog2 != null && (robertoTextView3 = (RobertoTextView) dialog2.findViewById(R.id.tvJournalDialogYes)) != null) {
                                    robertoTextView3.setTextColor(g0.a.b(this$0.requireContext(), R.color.amahaTerracota));
                                }
                                Dialog dialog3 = this$0.B;
                                if (dialog3 != null) {
                                    view2 = dialog3.findViewById(R.id.ldJournalDialogYesLoading);
                                } else {
                                    view2 = null;
                                }
                                if (view2 != null) {
                                    view2.setVisibility(0);
                                }
                                this$0.K().e(model.getFirestoreDocumentId());
                                String str5 = gk.a.f16573a;
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("entry_id", model.getId());
                                bundle2.putLong("user_entered_date", model.getUserEnteredDate());
                                bundle2.putBoolean("is_favourite", model.isFavourite());
                                String templateType2 = model.getTemplateType();
                                i.g(templateType2, "templateType");
                                if (i.b(templateType2, "regular")) {
                                    str2 = "free_text_journal";
                                } else if (i.b(templateType2, "question")) {
                                    str2 = "question";
                                } else if (i.b(templateType2, Constants.GOAL_TYPE_THOUGHT)) {
                                    str2 = "thought_journal";
                                } else if (!i.b(templateType2, "arc")) {
                                    str2 = "";
                                } else {
                                    str2 = "arc";
                                }
                                bundle2.putString("template", str2);
                                bundle2.putBoolean("is_draft", true);
                                hs.k kVar2 = hs.k.f19476a;
                                gk.a.b(bundle2, "journal_delete_popup_yes");
                                return;
                        }
                    }
                });
            }
            Dialog dialog = dVar.B;
            if (dialog != null && (robertoTextView = (RobertoTextView) dialog.findViewById(R.id.tvJournalDialogYes)) != null) {
                robertoTextView.setOnClickListener(new View.OnClickListener() { // from class: nm.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        View view2;
                        String str2;
                        RobertoTextView robertoTextView3;
                        String str3;
                        int i10 = r3;
                        JournalModel model = journalModel2;
                        d this$0 = dVar;
                        switch (i10) {
                            case 0:
                                int i11 = d.F;
                                i.g(this$0, "this$0");
                                i.g(model, "$model");
                                String str4 = gk.a.f16573a;
                                Bundle bundle = new Bundle();
                                bundle.putString("entry_id", model.getId());
                                bundle.putLong("user_entered_date", model.getUserEnteredDate());
                                bundle.putBoolean("is_favourite", model.isFavourite());
                                String templateType = model.getTemplateType();
                                i.g(templateType, "templateType");
                                if (i.b(templateType, "regular")) {
                                    str3 = "free_text_journal";
                                } else if (i.b(templateType, "question")) {
                                    str3 = "question";
                                } else if (i.b(templateType, Constants.GOAL_TYPE_THOUGHT)) {
                                    str3 = "thought_journal";
                                } else if (!i.b(templateType, "arc")) {
                                    str3 = "";
                                } else {
                                    str3 = "arc";
                                }
                                bundle.putString("template", str3);
                                bundle.putBoolean("is_draft", true);
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle, "journal_delete_popup_no");
                                Dialog dialog2 = this$0.B;
                                if (dialog2 != null) {
                                    dialog2.dismiss();
                                    return;
                                }
                                return;
                            default:
                                int i12 = d.F;
                                i.g(this$0, "this$0");
                                i.g(model, "$model");
                                Dialog dialog22 = this$0.B;
                                if (dialog22 != null && (robertoTextView3 = (RobertoTextView) dialog22.findViewById(R.id.tvJournalDialogYes)) != null) {
                                    robertoTextView3.setTextColor(g0.a.b(this$0.requireContext(), R.color.amahaTerracota));
                                }
                                Dialog dialog3 = this$0.B;
                                if (dialog3 != null) {
                                    view2 = dialog3.findViewById(R.id.ldJournalDialogYesLoading);
                                } else {
                                    view2 = null;
                                }
                                if (view2 != null) {
                                    view2.setVisibility(0);
                                }
                                this$0.K().e(model.getFirestoreDocumentId());
                                String str5 = gk.a.f16573a;
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("entry_id", model.getId());
                                bundle2.putLong("user_entered_date", model.getUserEnteredDate());
                                bundle2.putBoolean("is_favourite", model.isFavourite());
                                String templateType2 = model.getTemplateType();
                                i.g(templateType2, "templateType");
                                if (i.b(templateType2, "regular")) {
                                    str2 = "free_text_journal";
                                } else if (i.b(templateType2, "question")) {
                                    str2 = "question";
                                } else if (i.b(templateType2, Constants.GOAL_TYPE_THOUGHT)) {
                                    str2 = "thought_journal";
                                } else if (!i.b(templateType2, "arc")) {
                                    str2 = "";
                                } else {
                                    str2 = "arc";
                                }
                                bundle2.putString("template", str2);
                                bundle2.putBoolean("is_draft", true);
                                hs.k kVar2 = hs.k.f19476a;
                                gk.a.b(bundle2, "journal_delete_popup_yes");
                                return;
                        }
                    }
                });
            }
            Dialog dialog2 = dVar.B;
            if (dialog2 != null) {
                dialog2.show();
            }
            String str2 = gk.a.f16573a;
            Bundle bundle = new Bundle();
            bundle.putString("entry_id", journalModel2.getId());
            bundle.putLong("user_entered_date", journalModel2.getUserEnteredDate());
            bundle.putBoolean("is_favourite", journalModel2.isFavourite());
            String templateType = journalModel2.getTemplateType();
            i.g(templateType, "templateType");
            if (i.b(templateType, "regular")) {
                str = "free_text_journal";
            } else {
                String str3 = "question";
                if (!i.b(templateType, "question")) {
                    if (i.b(templateType, Constants.GOAL_TYPE_THOUGHT)) {
                        str = "thought_journal";
                    } else {
                        str3 = "arc";
                        if (!i.b(templateType, "arc")) {
                            str = "";
                        }
                    }
                }
                str = str3;
            }
            bundle.putString("template", str);
            bundle.putBoolean("is_draft", true);
            hs.k kVar = hs.k.f19476a;
            gk.a.b(bundle, "journal_delete_click");
        }
        return hs.k.f19476a;
    }
}
