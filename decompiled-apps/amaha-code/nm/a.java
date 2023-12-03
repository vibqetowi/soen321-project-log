package nm;

import am.w;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o0;
import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.journal.model.JournalQuestionModel;
import com.theinnerhour.b2b.components.journal.model.Questions;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.n;
import gv.r;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import ol.k;
import ta.v;
/* compiled from: JournalEntryPointFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnm/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a extends Fragment {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f26387z = 0;

    /* renamed from: v  reason: collision with root package name */
    public um.b f26389v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f26390w;

    /* renamed from: x  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f26391x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f26392y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f26388u = LogHelper.INSTANCE.makeLogTag("JournalEntryPointFragment");

    public a() {
        androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new w(20, this));
        i.f(registerForActivityResult, "registerForActivityResul…teJournalCard()\n        }");
        this.f26391x = registerForActivityResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae A[Catch: Exception -> 0x0107, TryCatch #3 {Exception -> 0x0107, blocks: (B:30:0x0090, B:32:0x009a, B:35:0x00a2, B:41:0x00ae, B:43:0x00b8, B:45:0x00be, B:47:0x00c8, B:49:0x00ce, B:54:0x0100, B:50:0x00db, B:52:0x00f6), top: B:161:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f6 A[Catch: Exception -> 0x0107, TryCatch #3 {Exception -> 0x0107, blocks: (B:30:0x0090, B:32:0x009a, B:35:0x00a2, B:41:0x00ae, B:43:0x00b8, B:45:0x00be, B:47:0x00c8, B:49:0x00ce, B:54:0x0100, B:50:0x00db, B:52:0x00f6), top: B:161:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F() {
        String str;
        Integer num;
        fd.f fVar;
        String j02;
        JournalQuestionModel journalQuestionModel;
        ArrayList<Questions> questions;
        boolean z10;
        boolean z11;
        boolean z12;
        int i6;
        boolean z13;
        String string;
        String str2;
        boolean z14;
        String stringValue;
        String str3;
        String str4;
        String firstName;
        JournalQuestionModel journalQuestionModel2;
        BufferedReader bufferedReader;
        if (this.f26389v == null) {
            this.f26389v = (um.b) new o0(this).a(um.b.class);
        }
        um.b bVar = this.f26389v;
        boolean z15 = true;
        if (bVar != null && bVar.f34237z == null) {
            hs.i iVar = bVar.f34236y;
            ((tm.a) iVar.getValue()).f33281a = 1;
            try {
                InputStream openRawResource = bVar.f2382x.getResources().openRawResource(((tm.a) iVar.getValue()).e());
                i.f(openRawResource, "getApplication<Applicati…nalFlowUtils.getJSONId())");
                InputStreamReader inputStreamReader = new InputStreamReader(openRawResource, gv.a.f16927b);
                if (inputStreamReader instanceof BufferedReader) {
                    bufferedReader = (BufferedReader) inputStreamReader;
                } else {
                    bufferedReader = new BufferedReader(inputStreamReader, 8192);
                }
                String c12 = ca.a.c1(bufferedReader);
                ca.a.z(bufferedReader, null);
                journalQuestionModel2 = (JournalQuestionModel) new sf.i().b(JournalQuestionModel.class, c12);
            } catch (Exception unused) {
                journalQuestionModel2 = new JournalQuestionModel(null, null, null, null, 15, null);
            }
            bVar.f34237z = journalQuestionModel2;
        }
        if (this.f26389v != null) {
            str = "";
            try {
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null) {
                    str2 = user.getFirstName();
                } else {
                    str2 = null;
                }
                if (str2 != null && str2.length() != 0) {
                    z14 = false;
                    if (!z14) {
                        User user2 = FirebasePersistence.getInstance().getUser();
                        if (user2 != null && (firstName = user2.getFirstName()) != null) {
                            str4 = r.i1(firstName).toString();
                        } else {
                            str4 = null;
                        }
                        if (!i.b(str4, "null")) {
                            str3 = FirebasePersistence.getInstance().getUser().getFirstName();
                            i.f(str3, "{\n            if (!Fireb…\"\n            }\n        }");
                            str = str3;
                        }
                    }
                    stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_FIRSTNAME);
                    i.f(stringValue, "getInstance().getStringV…ionManager.KEY_FIRSTNAME)");
                    if (!i.b(r.i1(stringValue).toString(), "null")) {
                        str3 = "";
                    } else {
                        str3 = SessionManager.getInstance().getStringValue(SessionManager.KEY_FIRSTNAME);
                    }
                    i.f(str3, "{\n            if (!Fireb…\"\n            }\n        }");
                    str = str3;
                }
                z14 = true;
                if (!z14) {
                }
                stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_FIRSTNAME);
                i.f(stringValue, "getInstance().getStringV…ionManager.KEY_FIRSTNAME)");
                if (!i.b(r.i1(stringValue).toString(), "null")) {
                }
                i.f(str3, "{\n            if (!Fireb…\"\n            }\n        }");
                str = str3;
            } catch (Exception unused2) {
            }
        } else {
            str = null;
        }
        RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvJournalSubHeader);
        if (robertoTextView != null) {
            if (str != null && !n.B0(str)) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (!z13 && !i.b(str, "null")) {
                string = getString(R.string.your_journal_name, str);
            } else {
                string = getString(R.string.your_journal_generic);
            }
            robertoTextView.setText(string);
        }
        if (this.f26389v != null) {
            int i10 = Calendar.getInstance().get(11);
            if (5 <= i10 && i10 < 11) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i6 = R.drawable.ic_journal_cover_dawn;
            } else {
                if (11 <= i10 && i10 < 17) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    i6 = R.drawable.ic_journal_cover_day;
                } else {
                    if (17 <= i10 && i10 < 23) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        i6 = R.drawable.ic_journal_cover_dusk;
                    } else {
                        i6 = R.drawable.ic_journal_cover_dark;
                    }
                }
            }
            num = Integer.valueOf(i6);
        } else {
            num = null;
        }
        if (num == null || num.intValue() != R.drawable.ic_journal_cover_day) {
            ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalDescription)).setTextColor(g0.a.b(requireContext(), R.color.white));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalCta)).setTextColor(g0.a.b(requireContext(), R.color.white));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalDate)).setTextColor(g0.a.b(requireContext(), R.color.white));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalLastEntryText)).setTextColor(g0.a.b(requireContext(), R.color.white));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalSubHeader)).setTextColor(g0.a.b(requireContext(), R.color.white));
            ((AppCompatImageView) _$_findCachedViewById(R.id.tvJournalHeader)).setColorFilter(g0.a.b(requireContext(), R.color.white), PorterDuff.Mode.SRC_ATOP);
        }
        if (num != null) {
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivJournal)).setImageResource(num.intValue());
        }
        ArrayList arrayList = new ArrayList();
        if (!this.f26390w) {
            um.b bVar2 = this.f26389v;
            if (bVar2 != null && (journalQuestionModel = bVar2.f34237z) != null && (questions = journalQuestionModel.getQuestions()) != null) {
                for (Questions questions2 : questions) {
                    arrayList.add(questions2.getQuestion());
                }
            }
            long longValue = ApplicationPersistence.getInstance().getLongValue("journal_question_time");
            int intValue = ApplicationPersistence.getInstance().getIntValue("journal_question_position", -1);
            int intValue2 = ApplicationPersistence.getInstance().getIntValue("journal_question_today_position", -1);
            int i11 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
            if (i11 != 0 && longValue != Utils.INSTANCE.getTodayTimeInSeconds()) {
                if (intValue2 < arrayList.size() - 1) {
                    intValue2++;
                } else {
                    intValue2 = 0;
                }
                ApplicationPersistence.getInstance().setIntValue("journal_question_today_position", intValue2);
            } else {
                if (i11 == 0) {
                    ApplicationPersistence.getInstance().setIntValue("journal_question_today_position", 0);
                } else if (intValue2 <= intValue) {
                    if (intValue < arrayList.size() - 1) {
                        intValue2 = intValue + 1;
                    }
                }
                intValue2 = 0;
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalLastEntryText)).setVisibility(0);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalDate)).setVisibility(0);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalDescription)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalLastEntryText)).setText(getString(R.string.journal_todays_question));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalCta)).setText(getString(R.string.journal_tap_to_begin));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalDate)).setText((CharSequence) arrayList.get(intValue2));
        } else {
            String stringValue2 = ApplicationPersistence.getInstance().getStringValue("journal_last_entry_date");
            if (stringValue2 != null && !n.B0(stringValue2)) {
                z15 = false;
            }
            if (z15) {
                um.b bVar3 = this.f26389v;
                if (bVar3 != null && (fVar = FirebaseAuth.getInstance().f) != null && (j02 = fVar.j0()) != null) {
                    v.H(kc.f.H(bVar3), null, 0, new um.a(new pm.a(), j02, bVar3, null), 3);
                }
                ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalDescription)).setVisibility(0);
                ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalDate)).setVisibility(8);
                ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalLastEntryText)).setVisibility(8);
                ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalCta)).setText(getString(R.string.journal_tap_to_begin));
            } else {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalDescription)).setVisibility(8);
                ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalDate)).setVisibility(0);
                ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalLastEntryText)).setVisibility(0);
                ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalLastEntryText)).setText(getString(R.string.journal_last_entry_made_on));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalDate)).setText(stringValue2);
                ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalCta)).setText(getString(R.string.journal_tap_to_view));
            }
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.clJournalContainer);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new k(18, this));
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f26392y;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(i6)) != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        i.g(inflater, "inflater");
        return inflater.inflate(R.layout.layout_not_v4_db_journal_card, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f26392y.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            F();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26388u, e10);
        }
    }
}
