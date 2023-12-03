package vq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.GratitudeJournalAnswerModel;
import com.theinnerhour.b2b.model.GratitudeJournalQuestionModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import qq.n;
/* compiled from: GratitudeJournalNewFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvq/b;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class b extends rr.b {
    public static final /* synthetic */ int A = 0;

    /* renamed from: u  reason: collision with root package name */
    public int f35353u;

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList<GratitudeJournalQuestionModel> f35354v;

    /* renamed from: w  reason: collision with root package name */
    public int f35355w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f35356x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f35357y;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashMap f35358z = new LinkedHashMap();

    public b() {
        ArrayList<GratitudeJournalQuestionModel> gratitudeJournalQuestions = Constants.getGratitudeJournalQuestions();
        i.f(gratitudeJournalQuestions, "getGratitudeJournalQuestions()");
        this.f35354v = gratitudeJournalQuestions;
    }

    public final void J(int i6, String str) {
        if (!this.f35357y) {
            this.f35357y = true;
            String questionId = this.f35354v.get(i6).getQuestionId();
            if (!FirebasePersistence.getInstance().getUser().getHappiness().getGratitudeQuestionId().contains(questionId)) {
                FirebasePersistence.getInstance().getUser().getHappiness().getGratitudeQuestionId().add(questionId);
            }
            FirebasePersistence.getInstance().getUser().getHappiness().getAnswers().add(new GratitudeJournalAnswerModel(questionId, str));
            FirebasePersistence.getInstance().updateUserOnFirebase();
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f35358z;
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
        return inflater.inflate(R.layout.fragment_screen_a3, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f35358z.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        i.d(arguments);
        this.f35353u = arguments.getInt("Gratitude");
        Bundle arguments2 = getArguments();
        i.d(arguments2);
        this.f35355w = arguments2.getInt("Dash");
        Bundle arguments3 = getArguments();
        i.d(arguments3);
        boolean z10 = arguments3.getBoolean("DashBoolean");
        this.f35356x = z10;
        ArrayList<GratitudeJournalQuestionModel> arrayList = this.f35354v;
        if (z10) {
            int i6 = this.f35355w;
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 == 3) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.a3title)).setText(getString(R.string.gratitudeTitle3));
                        ((RobertoTextView) _$_findCachedViewById(R.id.a3Subtitle)).setText(arrayList.get(2).getQuestion());
                        ((RobertoTextView) _$_findCachedViewById(R.id.a3description)).setText(getString(R.string.gratitudeExample3));
                        ((RobertoEditText) _$_findCachedViewById(R.id.a3EditText)).setHint(getString(R.string.gratitudeHint3));
                    }
                } else {
                    ((RobertoTextView) _$_findCachedViewById(R.id.a3title)).setText(getString(R.string.gratitudeTitle2));
                    ((RobertoTextView) _$_findCachedViewById(R.id.a3Subtitle)).setText(arrayList.get(1).getQuestion());
                    ((RobertoTextView) _$_findCachedViewById(R.id.a3description)).setText(getString(R.string.gratitudeExample2));
                    ((RobertoEditText) _$_findCachedViewById(R.id.a3EditText)).setHint(getString(R.string.gratitudeHint2));
                }
            } else {
                ((RobertoTextView) _$_findCachedViewById(R.id.a3title)).setText(getString(R.string.gratitudeTitle1));
                ((RobertoTextView) _$_findCachedViewById(R.id.a3Subtitle)).setText(arrayList.get(0).getQuestion());
                ((RobertoTextView) _$_findCachedViewById(R.id.a3description)).setText(getString(R.string.gratitudeExample1));
                ((RobertoEditText) _$_findCachedViewById(R.id.a3EditText)).setHint(getString(R.string.gratitudeHint1));
            }
        } else {
            int i10 = this.f35353u;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.a3title)).setText(getString(R.string.gratitudeTitle3));
                        ((RobertoTextView) _$_findCachedViewById(R.id.a3Subtitle)).setText(arrayList.get(2).getQuestion());
                        ((RobertoTextView) _$_findCachedViewById(R.id.a3description)).setText(getString(R.string.gratitudeExample3));
                        ((RobertoEditText) _$_findCachedViewById(R.id.a3EditText)).setHint(getString(R.string.gratitudeHint3));
                    }
                } else {
                    ((RobertoTextView) _$_findCachedViewById(R.id.a3title)).setText(getString(R.string.gratitudeTitle2));
                    ((RobertoTextView) _$_findCachedViewById(R.id.a3Subtitle)).setText(arrayList.get(1).getQuestion());
                    ((RobertoTextView) _$_findCachedViewById(R.id.a3description)).setText(getString(R.string.gratitudeExample2));
                    ((RobertoEditText) _$_findCachedViewById(R.id.a3EditText)).setHint(getString(R.string.gratitudeHint2));
                }
            } else {
                ((RobertoTextView) _$_findCachedViewById(R.id.a3title)).setText(getString(R.string.gratitudeTitle1));
                ((RobertoTextView) _$_findCachedViewById(R.id.a3Subtitle)).setText(arrayList.get(0).getQuestion());
                ((RobertoTextView) _$_findCachedViewById(R.id.a3description)).setText(getString(R.string.gratitudeExample1));
                ((RobertoEditText) _$_findCachedViewById(R.id.a3EditText)).setHint(getString(R.string.gratitudeHint1));
            }
        }
        ((AppCompatImageView) _$_findCachedViewById(R.id.a3FloatingButton)).setOnClickListener(new n(this, 21));
    }
}
