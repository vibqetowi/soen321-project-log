package tm;

import com.google.firebase.storage.StorageReference;
import com.theinnerhour.b2b.R;
import is.k;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/* compiled from: JournalFlowUtils.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f33281a;

    /* renamed from: b  reason: collision with root package name */
    public final String[][] f33282b = {new String[]{"jb1"}, new String[]{"jq1"}, new String[]{"jt1", "jt2", "jt3", "jt4", "jt5"}};

    /* renamed from: c  reason: collision with root package name */
    public final HashSet<StorageReference>[] f33283c = {new HashSet<>(), new HashSet<>(), new HashSet<>()};

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<String, Object>[] f33284d = {new HashMap<>(), new HashMap<>(), new HashMap<>()};

    /* renamed from: e  reason: collision with root package name */
    public final Integer[] f33285e = {Integer.valueOf((int) R.string.journalTemplateRegularHeader), Integer.valueOf((int) R.string.journalTemplateQuestionHeader), Integer.valueOf((int) R.string.journalTemplateThoughtHeader)};
    public final Boolean[] f;

    /* renamed from: g  reason: collision with root package name */
    public final Integer[] f33286g;

    public a() {
        Boolean bool = Boolean.FALSE;
        this.f = new Boolean[]{bool, bool, bool};
        this.f33286g = new Integer[]{0, 0, 0};
    }

    public final String a() {
        int i6 = this.f33281a;
        String[][] strArr = this.f33282b;
        if (i6 < strArr.length) {
            Integer[] numArr = this.f33286g;
            if (i6 < numArr.length) {
                return strArr[i6][numArr[i6].intValue()];
            }
            return "";
        }
        return "";
    }

    public final String b() {
        int i6 = this.f33281a;
        if (i6 != 0) {
            if (i6 != 1) {
                return "thought_journal";
            }
            return "question";
        }
        return "free_text_journal";
    }

    public final int c() {
        return this.f33286g[this.f33281a].intValue();
    }

    public final HashMap<String, Object> d() {
        return (HashMap) k.V1(this.f33281a, this.f33284d);
    }

    public final int e() {
        int i6 = this.f33281a;
        if (i6 != 0) {
            if (i6 == 1 || i6 != 2) {
                return R.raw.journal_question;
            }
            return R.raw.journal_thought;
        }
        return R.raw.journal_regular;
    }

    public final void f(boolean z10) {
        this.f[this.f33281a] = Boolean.valueOf(z10);
    }

    public final void g(HashMap<String, Object> hashMap) {
        int i6 = this.f33281a;
        HashMap<String, Object>[] hashMapArr = this.f33284d;
        if (i6 >= hashMapArr.length) {
            return;
        }
        HashMap<String, Object> hashMap2 = hashMapArr[i6];
        Set<String> keySet = hashMap.keySet();
        kotlin.jvm.internal.i.f(keySet, "data.keys");
        for (String key : keySet) {
            kotlin.jvm.internal.i.f(key, "key");
            hashMap2.put(key, hashMap.get(key));
        }
        hashMapArr[this.f33281a] = hashMap2;
    }
}
