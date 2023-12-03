package il;

import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: ResourceCardUtils.kt */
/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final String f20389a = LogHelper.INSTANCE.makeLogTag("ResourceCardUtils");

    public final String a(String str) {
        String string;
        if (str != null) {
            try {
                switch (str.hashCode()) {
                    case -1864532585:
                        if (!str.equals("Quotes")) {
                            break;
                        } else {
                            string = MyApplication.V.a().getString(R.string.quote);
                            break;
                        }
                    case -1732810888:
                        if (!str.equals("Videos")) {
                            break;
                        } else {
                            string = MyApplication.V.a().getString(R.string.video);
                            break;
                        }
                    case -1692490108:
                        if (!str.equals("Creatives")) {
                            break;
                        } else {
                            string = MyApplication.V.a().getString(R.string.creative);
                            break;
                        }
                    case -1164233123:
                        if (!str.equals("Articles")) {
                            break;
                        } else {
                            string = MyApplication.V.a().getString(R.string.article);
                            break;
                        }
                    case -312086034:
                        if (!str.equals("Therapist says")) {
                            break;
                        } else {
                            string = MyApplication.V.a().getString(R.string.therapistSays);
                            break;
                        }
                    case 2606936:
                        if (!str.equals("Tips")) {
                            break;
                        } else {
                            string = MyApplication.V.a().getString(R.string.tips);
                            break;
                        }
                }
                kotlin.jvm.internal.i.f(string, "{\n            when (type…\"\n            }\n        }");
                return string;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f20389a, e10);
                return "";
            }
        }
        string = "";
        kotlin.jvm.internal.i.f(string, "{\n            when (type…\"\n            }\n        }");
        return string;
    }
}
