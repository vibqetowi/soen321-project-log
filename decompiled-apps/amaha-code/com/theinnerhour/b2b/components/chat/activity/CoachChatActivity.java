package com.theinnerhour.b2b.components.chat.activity;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.ProgressDialog;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.appcompat.app.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.FileProvider;
import androidx.lifecycle.o0;
import androidx.lifecycle.w;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.components.chat.model.ChatMessage;
import com.theinnerhour.b2b.components.chat.model.ChatProgress;
import com.theinnerhour.b2b.components.chat.model.ChatUser;
import com.theinnerhour.b2b.model.VolleySingleton;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CustomVolleyJsonObjectRequest;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import gv.r;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.security.Key;
import java.security.KeyStore;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import org.json.JSONObject;
import qk.d;
import qk.e;
import rk.f;
/* compiled from: CoachChatActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/theinnerhour/b2b/components/chat/activity/CoachChatActivity;", "Landroidx/appcompat/app/c;", "Lqk/e$b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CoachChatActivity extends c implements e.b {
    public static final /* synthetic */ int K = 0;
    public e A;
    public f G;
    public Uri H;
    public String I;

    /* renamed from: w  reason: collision with root package name */
    public ProgressDialog f10627w;

    /* renamed from: x  reason: collision with root package name */
    public ChatUser f10628x;

    /* renamed from: y  reason: collision with root package name */
    public ChatUser f10629y;

    /* renamed from: z  reason: collision with root package name */
    public ArrayList<ChatMessage> f10630z;
    public final LinkedHashMap J = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f10626v = LogHelper.INSTANCE.makeLogTag(CoachChatActivity.class);
    public final String B = "chat";
    public final String[] C = {"android.permission.CAMERA"};
    public final int D = R.styleable.AppCompatTheme_textColorSearchUrl;
    public final int E = R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
    public final int F = R.styleable.AppCompatTheme_toolbarStyle;

    /* compiled from: CoachChatActivity.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10631a;

        static {
            int[] iArr = new int[ChatProgress.values().length];
            try {
                iArr[ChatProgress.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChatProgress.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChatProgress.FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10631a = iArr;
        }
    }

    /* compiled from: CoachChatActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b implements Animator.AnimatorListener {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            i.g(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            i.g(animator, "animator");
            ((ConstraintLayout) CoachChatActivity.this.n0(com.theinnerhour.b2b.R.id.attachLinear)).setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            i.g(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            i.g(animator, "animator");
        }
    }

    @Override // qk.e.b
    public final void C() {
        if (f0.a.f(this, "android.permission.READ_EXTERNAL_STORAGE")) {
            b.a aVar = new b.a(this);
            AlertController.b bVar = aVar.f1046a;
            bVar.f1036l = true;
            bVar.f1028c = com.theinnerhour.b2b.R.drawable.ic_amaha_logo_white_bg;
            aVar.setTitle("Permission necessary");
            bVar.f1031g = "Storage permission is necessary";
            aVar.setPositiveButton(17039379, new pk.c(this, 1));
            androidx.appcompat.app.b create = aVar.create();
            i.f(create, "alertBuilder.create()");
            create.show();
            return;
        }
        f0.a.e(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, R.styleable.AppCompatTheme_toolbarStyle);
    }

    public final View n0(int i6) {
        LinkedHashMap linkedHashMap = this.J;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View findViewById = findViewById(i6);
            if (findViewById != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    public final void o0() {
        File file;
        try {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            if (intent.resolveActivity(getPackageManager()) != null) {
                try {
                    file = q0();
                } catch (IOException e10) {
                    LogHelper.INSTANCE.e(this.f10626v, e10);
                    file = null;
                }
                if (file != null) {
                    Uri b10 = FileProvider.b(this, "com.theinnerhour.b2b.provider", file);
                    i.f(b10, "getUriForFile(\n         …                        )");
                    this.H = b10;
                    intent.putExtra("output", b10);
                    startActivityForResult(intent, this.E);
                }
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(e11);
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i6, int i10, Intent intent) {
        super.onActivityResult(i6, i10, intent);
        if (i10 == -1) {
            if (i6 == this.F) {
                if (intent != null) {
                    try {
                        Uri data = intent.getData();
                        String s02 = s0(data);
                        f fVar = this.G;
                        if (fVar != null) {
                            fVar.g(s02, data, false);
                        } else {
                            i.q("chatViewModel");
                            throw null;
                        }
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(e10);
                    }
                }
            } else if (i6 == this.E) {
                try {
                    Uri uri = this.H;
                    if (uri != null) {
                        f fVar2 = this.G;
                        if (fVar2 != null) {
                            String str = this.I;
                            if (str != null) {
                                fVar2.g(str.concat(".jpg"), uri, true);
                            } else {
                                i.q("currentPhotoName");
                                throw null;
                            }
                        } else {
                            i.q("chatViewModel");
                            throw null;
                        }
                    } else {
                        i.q("currentPhotoURI");
                        throw null;
                    }
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(e11);
                } finally {
                }
            } else if (i6 == this.D && intent != null) {
                try {
                    Uri data2 = intent.getData();
                    String s03 = s0(data2);
                    f fVar3 = this.G;
                    if (fVar3 != null) {
                        fVar3.g(s03, data2, false);
                    } else {
                        i.q("chatViewModel");
                        throw null;
                    }
                } catch (Exception e12) {
                    LogHelper.INSTANCE.e(e12);
                }
            }
            Toast.makeText(this, "Upload started", 1).show();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        finish();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            setContentView(com.theinnerhour.b2b.R.layout.activity_coach_chat);
            Window window = getWindow();
            window.setStatusBarColor(g0.a.b(this, com.theinnerhour.b2b.R.color.login_grey_background));
            if (Build.VERSION.SDK_INT >= 23) {
                window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 8192);
            }
            i.f(FirebaseDatabase.getInstance().getReference(), "getInstance().reference");
            Intent intent = getIntent();
            if (intent != null) {
                Serializable serializableExtra = intent.getSerializableExtra("friend");
                i.e(serializableExtra, "null cannot be cast to non-null type com.theinnerhour.b2b.components.chat.model.ChatUser");
                this.f10629y = (ChatUser) serializableExtra;
            }
            this.f10627w = new ProgressDialog(this);
            t0().setMessage("Please wait. Initializing...");
            t0().setProgressStyle(0);
            t0().setCancelable(false);
            r0();
            u0();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10626v, "exception", e10);
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        try {
            f fVar = this.G;
            if (fVar != null) {
                fVar.C.k(this);
                f fVar2 = this.G;
                if (fVar2 != null) {
                    fVar2.B.k(this);
                    f fVar3 = this.G;
                    if (fVar3 != null) {
                        fVar3.A.k(this);
                        f fVar4 = this.G;
                        if (fVar4 != null) {
                            Query query = fVar4.F;
                            if (query != null) {
                                ChildEventListener childEventListener = fVar4.G;
                                if (childEventListener != null) {
                                    if (query != null) {
                                        if (childEventListener != null) {
                                            query.removeEventListener(childEventListener);
                                            return;
                                        } else {
                                            i.q("channelEventListener");
                                            throw null;
                                        }
                                    }
                                    i.q("channelQuery");
                                    throw null;
                                }
                                i.q("channelEventListener");
                                throw null;
                            }
                            i.q("channelQuery");
                            throw null;
                        }
                        i.q("chatViewModel");
                        throw null;
                    }
                    i.q("chatViewModel");
                    throw null;
                }
                i.q("chatViewModel");
                throw null;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10626v, e10.toString());
        }
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onPause() {
        LogHelper.INSTANCE.i(this.f10626v, "onPause");
        super.onPause();
        f fVar = this.G;
        if (fVar != null) {
            fVar.f(Constants.OFFLINE);
            MyApplication.V.a().D = false;
            return;
        }
        i.q("chatViewModel");
        throw null;
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i6, String[] permissions, int[] grantResults) {
        i.g(permissions, "permissions");
        i.g(grantResults, "grantResults");
        if (i6 == 111) {
            if (grantResults.length > 0 && grantResults[0] == 0) {
                o0();
            } else {
                Toast.makeText(this, "Permission is needed to take picture", 0).show();
            }
        } else if (i6 == 113) {
            if (grantResults.length <= 0 || grantResults[0] != 0) {
                Toast.makeText(this, "Permission is needed to download files", 0).show();
            }
        } else {
            super.onRequestPermissionsResult(i6, permissions, grantResults);
        }
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onResume() {
        LogHelper.INSTANCE.i(this.f10626v, "onResume");
        super.onResume();
        f fVar = this.G;
        if (fVar != null) {
            fVar.f(Constants.ONLINE);
            MyApplication.V.a().D = true;
            return;
        }
        i.q("chatViewModel");
        throw null;
    }

    public final void p0() {
        n0(com.theinnerhour.b2b.R.id.chatTransparentLayout).setVisibility(8);
        ValueAnimator ofInt = ValueAnimator.ofInt(((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.attachLinear)).getHeight(), 0);
        ofInt.addUpdateListener(new a9.c(2, this));
        ofInt.addListener(new b());
        ofInt.start();
    }

    public final File q0() {
        String str = "chat_camera_image_" + new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        i.g(str, "<set-?>");
        this.I = str;
        File file = new File(getFilesDir(), "images");
        if (!file.exists()) {
            file.mkdirs();
        }
        String str2 = this.I;
        if (str2 != null) {
            File createTempFile = File.createTempFile(str2, ".jpg", file);
            i.f(createTempFile, "createTempFile(\n        …/* directory */\n        )");
            return createTempFile;
        }
        i.q("currentPhotoName");
        throw null;
    }

    public final void r0() {
        ChatUser chatUser = new ChatUser();
        this.f10628x = chatUser;
        fd.f fVar = FirebaseAuth.getInstance().f;
        i.d(fVar);
        chatUser.setKey(fVar.j0());
        ChatUser chatUser2 = this.f10628x;
        i.d(chatUser2);
        chatUser2.setFirstName(SessionManager.getInstance().getStringValue(SessionManager.KEY_FIRSTNAME));
        ChatUser chatUser3 = this.f10628x;
        i.d(chatUser3);
        chatUser3.setLastName(SessionManager.getInstance().getStringValue(SessionManager.KEY_LASTNAME));
        ChatUser chatUser4 = this.f10628x;
        i.d(chatUser4);
        chatUser4.setProfile_path(FirebasePersistence.getInstance().getUser().getProfile_path());
    }

    public final String s0(Uri uri) {
        i.d(uri);
        String str = null;
        if (i.b(uri.getScheme(), "content")) {
            Cursor query = getContentResolver().query(uri, null, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndex("_display_name"));
                    }
                } finally {
                    query.close();
                }
            }
            if (query != null) {
            }
        }
        if (str == null) {
            String path = uri.getPath();
            i.d(path);
            int Q0 = r.Q0(path, '/', 0, 6);
            if (Q0 != -1) {
                String substring = path.substring(Q0 + 1);
                i.f(substring, "this as java.lang.String).substring(startIndex)");
                return substring;
            }
            return path;
        }
        return str;
    }

    public final ProgressDialog t0() {
        ProgressDialog progressDialog = this.f10627w;
        if (progressDialog != null) {
            return progressDialog;
        }
        i.q("progressDialog");
        throw null;
    }

    public final void u0() {
        ChatUser chatUser;
        String str;
        ChatUser chatUser2 = this.f10628x;
        i.d(chatUser2);
        ChatUser chatUser3 = this.f10629y;
        i.d(chatUser3);
        f fVar = (f) new o0(this, new kk.c(chatUser2, chatUser3)).a(f.class);
        this.G = fVar;
        if (fVar != null) {
            w<String> wVar = fVar.C;
            ChatUser chatUser4 = fVar.f30784y;
            try {
                String key = fVar.f30783x.getKey();
                i.d(key);
                String key2 = chatUser4.getKey();
                i.d(key2);
                if (key.compareTo(key2) < 0) {
                    str = chatUser.getKey() + '-' + chatUser4.getKey();
                } else {
                    str = chatUser4.getKey() + '-' + chatUser.getKey();
                }
                wVar.l(str);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(fVar.f30785z, "error in initialising channel", e10);
            }
            qk.c cVar = fVar.E;
            fVar.B = cVar.f29642d;
            String key3 = chatUser4.getKey();
            i.d(key3);
            String d10 = wVar.d();
            i.d(d10);
            String str2 = d10;
            w<ArrayList<ChatMessage>> wVar2 = cVar.f;
            wVar2.l(new ArrayList<>());
            w<ChatProgress> wVar3 = cVar.f29642d;
            wVar3.l(ChatProgress.LOADING);
            KeyStore keyStore = cVar.f29641c;
            keyStore.load(null);
            if (keyStore.containsAlias(key3) && Build.VERSION.SDK_INT >= 23) {
                Key key4 = keyStore.getKey(key3, null);
                i.e(key4, "null cannot be cast to non-null type javax.crypto.SecretKey");
                cVar.f29646i = (SecretKey) key4;
                wVar3.l(ChatProgress.SUCCESS);
            } else {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(AppsFlyerProperties.CHANNEL, str2);
                CustomVolleyJsonObjectRequest customVolleyJsonObjectRequest = new CustomVolleyJsonObjectRequest(1, "https://api.theinnerhour.com/v1/getkey", jSONObject, new qk.a(cVar, 0, key3), new d(cVar));
                customVolleyJsonObjectRequest.setRetryPolicy(new e4.d(Constants.TIMEOUT_MS, 2));
                VolleySingleton.getInstance().add(customVolleyJsonObjectRequest);
            }
            fVar.A = wVar2;
            f fVar2 = this.G;
            if (fVar2 != null) {
                fVar2.C.e(this, new pk.a(this, 0));
                f fVar3 = this.G;
                if (fVar3 != null) {
                    fVar3.B.e(this, new pk.a(this, 1));
                    return;
                } else {
                    i.q("chatViewModel");
                    throw null;
                }
            }
            i.q("chatViewModel");
            throw null;
        }
        i.q("chatViewModel");
        throw null;
    }
}
