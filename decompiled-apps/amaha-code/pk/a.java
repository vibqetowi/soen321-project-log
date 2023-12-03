package pk;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.x;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.chat.activity.CoachChatActivity;
import com.theinnerhour.b2b.components.chat.model.ChatMessage;
import com.theinnerhour.b2b.components.chat.model.ChatProgress;
import com.theinnerhour.b2b.components.chat.model.ChatUser;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import gv.n;
import is.u;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import qk.e;
import rk.f;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements x {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f28536a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CoachChatActivity f28537b;

    public /* synthetic */ a(CoachChatActivity coachChatActivity, int i6) {
        this.f28536a = i6;
        this.f28537b = coachChatActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.x
    public final void a(Object obj) {
        int i6 = this.f28536a;
        int i10 = -1;
        final CoachChatActivity this$0 = this.f28537b;
        switch (i6) {
            case 0:
                String mChannelName = (String) obj;
                int i11 = CoachChatActivity.K;
                i.g(this$0, "this$0");
                if (!i.b(mChannelName, "")) {
                    i.f(mChannelName, "mChannelName");
                    return;
                }
                return;
            case 1:
                ChatProgress chatProgress = (ChatProgress) obj;
                int i12 = CoachChatActivity.K;
                i.g(this$0, "this$0");
                if (chatProgress != null) {
                    i10 = CoachChatActivity.a.f10631a[chatProgress.ordinal()];
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (this$0.t0().isShowing()) {
                                this$0.t0().dismiss();
                            }
                            Toast.makeText(this$0, "Something went wrong", 0).show();
                            return;
                        }
                        if (this$0.t0().isShowing()) {
                            this$0.t0().dismiss();
                        }
                        Toast.makeText(this$0, "Something went wrong", 0).show();
                        return;
                    }
                    if (this$0.t0().isShowing()) {
                        this$0.t0().dismiss();
                    }
                    if (i.b(this$0.B, Constants.SESSION_TYPE_CHAT)) {
                        ((ConstraintLayout) this$0.n0(R.id.ll_chat_header)).setVisibility(0);
                        ((ConstraintLayout) this$0.n0(R.id.ll_chat_header)).findViewById(R.id.back_arrow).setOnClickListener(new View.OnClickListener() { // from class: pk.b
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Uri uri;
                                Uri uri2;
                                int i13 = r2;
                                boolean z10 = true;
                                CoachChatActivity this$02 = this$0;
                                switch (i13) {
                                    case 0:
                                        int i14 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        this$02.finish();
                                        return;
                                    case 1:
                                        int i15 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        if (n.F0(String.valueOf(((RobertoEditText) this$02.n0(R.id.chattext)).getText()), " ", "").length() <= 0) {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            f fVar = this$02.G;
                                            if (fVar != null) {
                                                String valueOf = String.valueOf(((RobertoEditText) this$02.n0(R.id.chattext)).getText());
                                                qk.c cVar = fVar.E;
                                                ChatUser chatUser = fVar.f30783x;
                                                ChatUser chatUser2 = fVar.f30784y;
                                                String d10 = fVar.C.d();
                                                i.d(d10);
                                                cVar.b(valueOf, "Text", null, chatUser, chatUser2, d10);
                                                ((RobertoEditText) this$02.n0(R.id.chattext)).setText("");
                                                return;
                                            }
                                            i.q("chatViewModel");
                                            throw null;
                                        }
                                        Toast.makeText(this$02, "Please type a message", 0).show();
                                        return;
                                    case 2:
                                        int i16 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        this$02.p0();
                                        int i17 = Build.VERSION.SDK_INT;
                                        int i18 = this$02.D;
                                        if (i17 >= 29) {
                                            uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
                                            Intent intent = new Intent("android.intent.action.PICK", uri);
                                            intent.setType("*/*");
                                            intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"application/txt", "application/pdf", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/msword"});
                                            this$02.startActivityForResult(Intent.createChooser(intent, "Select File"), i18);
                                            return;
                                        }
                                        Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                                        intent2.addCategory("android.intent.category.OPENABLE");
                                        intent2.setType("*/*");
                                        intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/msword", "*/*"});
                                        this$02.startActivityForResult(intent2, i18);
                                        return;
                                    case 3:
                                        int i19 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        this$02.p0();
                                        if (g0.a.a(this$02, "android.permission.CAMERA") == 0) {
                                            this$02.o0();
                                            return;
                                        } else if (f0.a.f(this$02, "android.permission.CAMERA")) {
                                            b.a aVar = new b.a(this$02);
                                            AlertController.b bVar = aVar.f1046a;
                                            bVar.f1036l = true;
                                            bVar.f1028c = R.drawable.ic_amaha_logo_white_bg;
                                            aVar.setTitle("Permission necessary");
                                            bVar.f1031g = "Camera permission is necessary";
                                            aVar.setPositiveButton(17039379, new c(this$02, 0));
                                            androidx.appcompat.app.b create = aVar.create();
                                            i.f(create, "alertBuilder.create()");
                                            create.show();
                                            return;
                                        } else {
                                            f0.a.e(this$02, this$02.C, com.appsflyer.R.styleable.AppCompatTheme_textColorSearchUrl);
                                            return;
                                        }
                                    case 4:
                                        int i20 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        this$02.p0();
                                        int i21 = Build.VERSION.SDK_INT;
                                        int i22 = this$02.F;
                                        if (i21 >= 29) {
                                            uri2 = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
                                            Intent intent3 = new Intent("android.intent.action.PICK", uri2);
                                            intent3.setType("image/*");
                                            this$02.startActivityForResult(Intent.createChooser(intent3, "Select File"), i22);
                                            return;
                                        }
                                        Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
                                        intent4.addCategory("android.intent.category.OPENABLE");
                                        intent4.setType("image/*");
                                        this$02.startActivityForResult(intent4, i22);
                                        return;
                                    case 5:
                                        int i23 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        this$02.p0();
                                        return;
                                    default:
                                        int i24 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        if (((ConstraintLayout) this$02.n0(R.id.attachLinear)).getVisibility() == 8) {
                                            this$02.n0(R.id.chatTransparentLayout).setVisibility(0);
                                            ((ConstraintLayout) this$02.n0(R.id.attachLinear)).setVisibility(0);
                                            ((ConstraintLayout) this$02.n0(R.id.attachLinear)).measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                                            ValueAnimator ofInt = ValueAnimator.ofInt(0, ((ConstraintLayout) this$02.n0(R.id.attachLinear)).getMeasuredHeight());
                                            ofInt.addUpdateListener(new a9.c(2, this$02));
                                            ofInt.start();
                                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((ConstraintLayout) this$02.n0(R.id.attachLinear), "alpha", 0.0f, 1.0f);
                                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this$02.n0(R.id.chatTransparentLayout), "alpha", 0.0f, 1.0f);
                                            if (ofFloat != null) {
                                                ofFloat.setDuration(400L);
                                            }
                                            if (ofFloat != null) {
                                                ofFloat.start();
                                            }
                                            if (ofFloat2 != null) {
                                                ofFloat2.setDuration(400L);
                                            }
                                            if (ofFloat2 != null) {
                                                ofFloat2.start();
                                                return;
                                            }
                                            return;
                                        }
                                        this$02.p0();
                                        return;
                                }
                            }
                        });
                        View findViewById = ((ConstraintLayout) this$0.n0(R.id.ll_chat_header)).findViewById(R.id.tvName);
                        i.e(findViewById, "null cannot be cast to non-null type android.widget.TextView");
                        ChatUser chatUser = this$0.f10629y;
                        i.d(chatUser);
                        ((TextView) findViewById).setText(chatUser.getName());
                        ((ConstraintLayout) this$0.n0(R.id.clDocumentsLayout)).setOnClickListener(new View.OnClickListener() { // from class: pk.b
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Uri uri;
                                Uri uri2;
                                int i13 = r2;
                                boolean z10 = true;
                                CoachChatActivity this$02 = this$0;
                                switch (i13) {
                                    case 0:
                                        int i14 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        this$02.finish();
                                        return;
                                    case 1:
                                        int i15 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        if (n.F0(String.valueOf(((RobertoEditText) this$02.n0(R.id.chattext)).getText()), " ", "").length() <= 0) {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            f fVar = this$02.G;
                                            if (fVar != null) {
                                                String valueOf = String.valueOf(((RobertoEditText) this$02.n0(R.id.chattext)).getText());
                                                qk.c cVar = fVar.E;
                                                ChatUser chatUser2 = fVar.f30783x;
                                                ChatUser chatUser22 = fVar.f30784y;
                                                String d10 = fVar.C.d();
                                                i.d(d10);
                                                cVar.b(valueOf, "Text", null, chatUser2, chatUser22, d10);
                                                ((RobertoEditText) this$02.n0(R.id.chattext)).setText("");
                                                return;
                                            }
                                            i.q("chatViewModel");
                                            throw null;
                                        }
                                        Toast.makeText(this$02, "Please type a message", 0).show();
                                        return;
                                    case 2:
                                        int i16 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        this$02.p0();
                                        int i17 = Build.VERSION.SDK_INT;
                                        int i18 = this$02.D;
                                        if (i17 >= 29) {
                                            uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
                                            Intent intent = new Intent("android.intent.action.PICK", uri);
                                            intent.setType("*/*");
                                            intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"application/txt", "application/pdf", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/msword"});
                                            this$02.startActivityForResult(Intent.createChooser(intent, "Select File"), i18);
                                            return;
                                        }
                                        Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                                        intent2.addCategory("android.intent.category.OPENABLE");
                                        intent2.setType("*/*");
                                        intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/msword", "*/*"});
                                        this$02.startActivityForResult(intent2, i18);
                                        return;
                                    case 3:
                                        int i19 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        this$02.p0();
                                        if (g0.a.a(this$02, "android.permission.CAMERA") == 0) {
                                            this$02.o0();
                                            return;
                                        } else if (f0.a.f(this$02, "android.permission.CAMERA")) {
                                            b.a aVar = new b.a(this$02);
                                            AlertController.b bVar = aVar.f1046a;
                                            bVar.f1036l = true;
                                            bVar.f1028c = R.drawable.ic_amaha_logo_white_bg;
                                            aVar.setTitle("Permission necessary");
                                            bVar.f1031g = "Camera permission is necessary";
                                            aVar.setPositiveButton(17039379, new c(this$02, 0));
                                            androidx.appcompat.app.b create = aVar.create();
                                            i.f(create, "alertBuilder.create()");
                                            create.show();
                                            return;
                                        } else {
                                            f0.a.e(this$02, this$02.C, com.appsflyer.R.styleable.AppCompatTheme_textColorSearchUrl);
                                            return;
                                        }
                                    case 4:
                                        int i20 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        this$02.p0();
                                        int i21 = Build.VERSION.SDK_INT;
                                        int i22 = this$02.F;
                                        if (i21 >= 29) {
                                            uri2 = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
                                            Intent intent3 = new Intent("android.intent.action.PICK", uri2);
                                            intent3.setType("image/*");
                                            this$02.startActivityForResult(Intent.createChooser(intent3, "Select File"), i22);
                                            return;
                                        }
                                        Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
                                        intent4.addCategory("android.intent.category.OPENABLE");
                                        intent4.setType("image/*");
                                        this$02.startActivityForResult(intent4, i22);
                                        return;
                                    case 5:
                                        int i23 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        this$02.p0();
                                        return;
                                    default:
                                        int i24 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        if (((ConstraintLayout) this$02.n0(R.id.attachLinear)).getVisibility() == 8) {
                                            this$02.n0(R.id.chatTransparentLayout).setVisibility(0);
                                            ((ConstraintLayout) this$02.n0(R.id.attachLinear)).setVisibility(0);
                                            ((ConstraintLayout) this$02.n0(R.id.attachLinear)).measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                                            ValueAnimator ofInt = ValueAnimator.ofInt(0, ((ConstraintLayout) this$02.n0(R.id.attachLinear)).getMeasuredHeight());
                                            ofInt.addUpdateListener(new a9.c(2, this$02));
                                            ofInt.start();
                                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((ConstraintLayout) this$02.n0(R.id.attachLinear), "alpha", 0.0f, 1.0f);
                                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this$02.n0(R.id.chatTransparentLayout), "alpha", 0.0f, 1.0f);
                                            if (ofFloat != null) {
                                                ofFloat.setDuration(400L);
                                            }
                                            if (ofFloat != null) {
                                                ofFloat.start();
                                            }
                                            if (ofFloat2 != null) {
                                                ofFloat2.setDuration(400L);
                                            }
                                            if (ofFloat2 != null) {
                                                ofFloat2.start();
                                                return;
                                            }
                                            return;
                                        }
                                        this$02.p0();
                                        return;
                                }
                            }
                        });
                        ((ConstraintLayout) this$0.n0(R.id.clCameraLayout)).setOnClickListener(new View.OnClickListener() { // from class: pk.b
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Uri uri;
                                Uri uri2;
                                int i13 = r2;
                                boolean z10 = true;
                                CoachChatActivity this$02 = this$0;
                                switch (i13) {
                                    case 0:
                                        int i14 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        this$02.finish();
                                        return;
                                    case 1:
                                        int i15 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        if (n.F0(String.valueOf(((RobertoEditText) this$02.n0(R.id.chattext)).getText()), " ", "").length() <= 0) {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            f fVar = this$02.G;
                                            if (fVar != null) {
                                                String valueOf = String.valueOf(((RobertoEditText) this$02.n0(R.id.chattext)).getText());
                                                qk.c cVar = fVar.E;
                                                ChatUser chatUser2 = fVar.f30783x;
                                                ChatUser chatUser22 = fVar.f30784y;
                                                String d10 = fVar.C.d();
                                                i.d(d10);
                                                cVar.b(valueOf, "Text", null, chatUser2, chatUser22, d10);
                                                ((RobertoEditText) this$02.n0(R.id.chattext)).setText("");
                                                return;
                                            }
                                            i.q("chatViewModel");
                                            throw null;
                                        }
                                        Toast.makeText(this$02, "Please type a message", 0).show();
                                        return;
                                    case 2:
                                        int i16 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        this$02.p0();
                                        int i17 = Build.VERSION.SDK_INT;
                                        int i18 = this$02.D;
                                        if (i17 >= 29) {
                                            uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
                                            Intent intent = new Intent("android.intent.action.PICK", uri);
                                            intent.setType("*/*");
                                            intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"application/txt", "application/pdf", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/msword"});
                                            this$02.startActivityForResult(Intent.createChooser(intent, "Select File"), i18);
                                            return;
                                        }
                                        Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                                        intent2.addCategory("android.intent.category.OPENABLE");
                                        intent2.setType("*/*");
                                        intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/msword", "*/*"});
                                        this$02.startActivityForResult(intent2, i18);
                                        return;
                                    case 3:
                                        int i19 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        this$02.p0();
                                        if (g0.a.a(this$02, "android.permission.CAMERA") == 0) {
                                            this$02.o0();
                                            return;
                                        } else if (f0.a.f(this$02, "android.permission.CAMERA")) {
                                            b.a aVar = new b.a(this$02);
                                            AlertController.b bVar = aVar.f1046a;
                                            bVar.f1036l = true;
                                            bVar.f1028c = R.drawable.ic_amaha_logo_white_bg;
                                            aVar.setTitle("Permission necessary");
                                            bVar.f1031g = "Camera permission is necessary";
                                            aVar.setPositiveButton(17039379, new c(this$02, 0));
                                            androidx.appcompat.app.b create = aVar.create();
                                            i.f(create, "alertBuilder.create()");
                                            create.show();
                                            return;
                                        } else {
                                            f0.a.e(this$02, this$02.C, com.appsflyer.R.styleable.AppCompatTheme_textColorSearchUrl);
                                            return;
                                        }
                                    case 4:
                                        int i20 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        this$02.p0();
                                        int i21 = Build.VERSION.SDK_INT;
                                        int i22 = this$02.F;
                                        if (i21 >= 29) {
                                            uri2 = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
                                            Intent intent3 = new Intent("android.intent.action.PICK", uri2);
                                            intent3.setType("image/*");
                                            this$02.startActivityForResult(Intent.createChooser(intent3, "Select File"), i22);
                                            return;
                                        }
                                        Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
                                        intent4.addCategory("android.intent.category.OPENABLE");
                                        intent4.setType("image/*");
                                        this$02.startActivityForResult(intent4, i22);
                                        return;
                                    case 5:
                                        int i23 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        this$02.p0();
                                        return;
                                    default:
                                        int i24 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        if (((ConstraintLayout) this$02.n0(R.id.attachLinear)).getVisibility() == 8) {
                                            this$02.n0(R.id.chatTransparentLayout).setVisibility(0);
                                            ((ConstraintLayout) this$02.n0(R.id.attachLinear)).setVisibility(0);
                                            ((ConstraintLayout) this$02.n0(R.id.attachLinear)).measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                                            ValueAnimator ofInt = ValueAnimator.ofInt(0, ((ConstraintLayout) this$02.n0(R.id.attachLinear)).getMeasuredHeight());
                                            ofInt.addUpdateListener(new a9.c(2, this$02));
                                            ofInt.start();
                                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((ConstraintLayout) this$02.n0(R.id.attachLinear), "alpha", 0.0f, 1.0f);
                                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this$02.n0(R.id.chatTransparentLayout), "alpha", 0.0f, 1.0f);
                                            if (ofFloat != null) {
                                                ofFloat.setDuration(400L);
                                            }
                                            if (ofFloat != null) {
                                                ofFloat.start();
                                            }
                                            if (ofFloat2 != null) {
                                                ofFloat2.setDuration(400L);
                                            }
                                            if (ofFloat2 != null) {
                                                ofFloat2.start();
                                                return;
                                            }
                                            return;
                                        }
                                        this$02.p0();
                                        return;
                                }
                            }
                        });
                        ((ConstraintLayout) this$0.n0(R.id.clGalleryLayout)).setOnClickListener(new View.OnClickListener() { // from class: pk.b
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Uri uri;
                                Uri uri2;
                                int i13 = r2;
                                boolean z10 = true;
                                CoachChatActivity this$02 = this$0;
                                switch (i13) {
                                    case 0:
                                        int i14 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        this$02.finish();
                                        return;
                                    case 1:
                                        int i15 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        if (n.F0(String.valueOf(((RobertoEditText) this$02.n0(R.id.chattext)).getText()), " ", "").length() <= 0) {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            f fVar = this$02.G;
                                            if (fVar != null) {
                                                String valueOf = String.valueOf(((RobertoEditText) this$02.n0(R.id.chattext)).getText());
                                                qk.c cVar = fVar.E;
                                                ChatUser chatUser2 = fVar.f30783x;
                                                ChatUser chatUser22 = fVar.f30784y;
                                                String d10 = fVar.C.d();
                                                i.d(d10);
                                                cVar.b(valueOf, "Text", null, chatUser2, chatUser22, d10);
                                                ((RobertoEditText) this$02.n0(R.id.chattext)).setText("");
                                                return;
                                            }
                                            i.q("chatViewModel");
                                            throw null;
                                        }
                                        Toast.makeText(this$02, "Please type a message", 0).show();
                                        return;
                                    case 2:
                                        int i16 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        this$02.p0();
                                        int i17 = Build.VERSION.SDK_INT;
                                        int i18 = this$02.D;
                                        if (i17 >= 29) {
                                            uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
                                            Intent intent = new Intent("android.intent.action.PICK", uri);
                                            intent.setType("*/*");
                                            intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"application/txt", "application/pdf", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/msword"});
                                            this$02.startActivityForResult(Intent.createChooser(intent, "Select File"), i18);
                                            return;
                                        }
                                        Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                                        intent2.addCategory("android.intent.category.OPENABLE");
                                        intent2.setType("*/*");
                                        intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/msword", "*/*"});
                                        this$02.startActivityForResult(intent2, i18);
                                        return;
                                    case 3:
                                        int i19 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        this$02.p0();
                                        if (g0.a.a(this$02, "android.permission.CAMERA") == 0) {
                                            this$02.o0();
                                            return;
                                        } else if (f0.a.f(this$02, "android.permission.CAMERA")) {
                                            b.a aVar = new b.a(this$02);
                                            AlertController.b bVar = aVar.f1046a;
                                            bVar.f1036l = true;
                                            bVar.f1028c = R.drawable.ic_amaha_logo_white_bg;
                                            aVar.setTitle("Permission necessary");
                                            bVar.f1031g = "Camera permission is necessary";
                                            aVar.setPositiveButton(17039379, new c(this$02, 0));
                                            androidx.appcompat.app.b create = aVar.create();
                                            i.f(create, "alertBuilder.create()");
                                            create.show();
                                            return;
                                        } else {
                                            f0.a.e(this$02, this$02.C, com.appsflyer.R.styleable.AppCompatTheme_textColorSearchUrl);
                                            return;
                                        }
                                    case 4:
                                        int i20 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        this$02.p0();
                                        int i21 = Build.VERSION.SDK_INT;
                                        int i22 = this$02.F;
                                        if (i21 >= 29) {
                                            uri2 = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
                                            Intent intent3 = new Intent("android.intent.action.PICK", uri2);
                                            intent3.setType("image/*");
                                            this$02.startActivityForResult(Intent.createChooser(intent3, "Select File"), i22);
                                            return;
                                        }
                                        Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
                                        intent4.addCategory("android.intent.category.OPENABLE");
                                        intent4.setType("image/*");
                                        this$02.startActivityForResult(intent4, i22);
                                        return;
                                    case 5:
                                        int i23 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        this$02.p0();
                                        return;
                                    default:
                                        int i24 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        if (((ConstraintLayout) this$02.n0(R.id.attachLinear)).getVisibility() == 8) {
                                            this$02.n0(R.id.chatTransparentLayout).setVisibility(0);
                                            ((ConstraintLayout) this$02.n0(R.id.attachLinear)).setVisibility(0);
                                            ((ConstraintLayout) this$02.n0(R.id.attachLinear)).measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                                            ValueAnimator ofInt = ValueAnimator.ofInt(0, ((ConstraintLayout) this$02.n0(R.id.attachLinear)).getMeasuredHeight());
                                            ofInt.addUpdateListener(new a9.c(2, this$02));
                                            ofInt.start();
                                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((ConstraintLayout) this$02.n0(R.id.attachLinear), "alpha", 0.0f, 1.0f);
                                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this$02.n0(R.id.chatTransparentLayout), "alpha", 0.0f, 1.0f);
                                            if (ofFloat != null) {
                                                ofFloat.setDuration(400L);
                                            }
                                            if (ofFloat != null) {
                                                ofFloat.start();
                                            }
                                            if (ofFloat2 != null) {
                                                ofFloat2.setDuration(400L);
                                            }
                                            if (ofFloat2 != null) {
                                                ofFloat2.start();
                                                return;
                                            }
                                            return;
                                        }
                                        this$02.p0();
                                        return;
                                }
                            }
                        });
                        this$0.n0(R.id.chatTransparentLayout).setOnClickListener(new View.OnClickListener() { // from class: pk.b
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Uri uri;
                                Uri uri2;
                                int i13 = r2;
                                boolean z10 = true;
                                CoachChatActivity this$02 = this$0;
                                switch (i13) {
                                    case 0:
                                        int i14 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        this$02.finish();
                                        return;
                                    case 1:
                                        int i15 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        if (n.F0(String.valueOf(((RobertoEditText) this$02.n0(R.id.chattext)).getText()), " ", "").length() <= 0) {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            f fVar = this$02.G;
                                            if (fVar != null) {
                                                String valueOf = String.valueOf(((RobertoEditText) this$02.n0(R.id.chattext)).getText());
                                                qk.c cVar = fVar.E;
                                                ChatUser chatUser2 = fVar.f30783x;
                                                ChatUser chatUser22 = fVar.f30784y;
                                                String d10 = fVar.C.d();
                                                i.d(d10);
                                                cVar.b(valueOf, "Text", null, chatUser2, chatUser22, d10);
                                                ((RobertoEditText) this$02.n0(R.id.chattext)).setText("");
                                                return;
                                            }
                                            i.q("chatViewModel");
                                            throw null;
                                        }
                                        Toast.makeText(this$02, "Please type a message", 0).show();
                                        return;
                                    case 2:
                                        int i16 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        this$02.p0();
                                        int i17 = Build.VERSION.SDK_INT;
                                        int i18 = this$02.D;
                                        if (i17 >= 29) {
                                            uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
                                            Intent intent = new Intent("android.intent.action.PICK", uri);
                                            intent.setType("*/*");
                                            intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"application/txt", "application/pdf", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/msword"});
                                            this$02.startActivityForResult(Intent.createChooser(intent, "Select File"), i18);
                                            return;
                                        }
                                        Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                                        intent2.addCategory("android.intent.category.OPENABLE");
                                        intent2.setType("*/*");
                                        intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/msword", "*/*"});
                                        this$02.startActivityForResult(intent2, i18);
                                        return;
                                    case 3:
                                        int i19 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        this$02.p0();
                                        if (g0.a.a(this$02, "android.permission.CAMERA") == 0) {
                                            this$02.o0();
                                            return;
                                        } else if (f0.a.f(this$02, "android.permission.CAMERA")) {
                                            b.a aVar = new b.a(this$02);
                                            AlertController.b bVar = aVar.f1046a;
                                            bVar.f1036l = true;
                                            bVar.f1028c = R.drawable.ic_amaha_logo_white_bg;
                                            aVar.setTitle("Permission necessary");
                                            bVar.f1031g = "Camera permission is necessary";
                                            aVar.setPositiveButton(17039379, new c(this$02, 0));
                                            androidx.appcompat.app.b create = aVar.create();
                                            i.f(create, "alertBuilder.create()");
                                            create.show();
                                            return;
                                        } else {
                                            f0.a.e(this$02, this$02.C, com.appsflyer.R.styleable.AppCompatTheme_textColorSearchUrl);
                                            return;
                                        }
                                    case 4:
                                        int i20 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        this$02.p0();
                                        int i21 = Build.VERSION.SDK_INT;
                                        int i22 = this$02.F;
                                        if (i21 >= 29) {
                                            uri2 = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
                                            Intent intent3 = new Intent("android.intent.action.PICK", uri2);
                                            intent3.setType("image/*");
                                            this$02.startActivityForResult(Intent.createChooser(intent3, "Select File"), i22);
                                            return;
                                        }
                                        Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
                                        intent4.addCategory("android.intent.category.OPENABLE");
                                        intent4.setType("image/*");
                                        this$02.startActivityForResult(intent4, i22);
                                        return;
                                    case 5:
                                        int i23 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        this$02.p0();
                                        return;
                                    default:
                                        int i24 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        if (((ConstraintLayout) this$02.n0(R.id.attachLinear)).getVisibility() == 8) {
                                            this$02.n0(R.id.chatTransparentLayout).setVisibility(0);
                                            ((ConstraintLayout) this$02.n0(R.id.attachLinear)).setVisibility(0);
                                            ((ConstraintLayout) this$02.n0(R.id.attachLinear)).measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                                            ValueAnimator ofInt = ValueAnimator.ofInt(0, ((ConstraintLayout) this$02.n0(R.id.attachLinear)).getMeasuredHeight());
                                            ofInt.addUpdateListener(new a9.c(2, this$02));
                                            ofInt.start();
                                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((ConstraintLayout) this$02.n0(R.id.attachLinear), "alpha", 0.0f, 1.0f);
                                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this$02.n0(R.id.chatTransparentLayout), "alpha", 0.0f, 1.0f);
                                            if (ofFloat != null) {
                                                ofFloat.setDuration(400L);
                                            }
                                            if (ofFloat != null) {
                                                ofFloat.start();
                                            }
                                            if (ofFloat2 != null) {
                                                ofFloat2.setDuration(400L);
                                            }
                                            if (ofFloat2 != null) {
                                                ofFloat2.start();
                                                return;
                                            }
                                            return;
                                        }
                                        this$02.p0();
                                        return;
                                }
                            }
                        });
                        ((AppCompatImageView) this$0.n0(R.id.attach)).setOnClickListener(new View.OnClickListener() { // from class: pk.b
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Uri uri;
                                Uri uri2;
                                int i13 = r2;
                                boolean z10 = true;
                                CoachChatActivity this$02 = this$0;
                                switch (i13) {
                                    case 0:
                                        int i14 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        this$02.finish();
                                        return;
                                    case 1:
                                        int i15 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        if (n.F0(String.valueOf(((RobertoEditText) this$02.n0(R.id.chattext)).getText()), " ", "").length() <= 0) {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            f fVar = this$02.G;
                                            if (fVar != null) {
                                                String valueOf = String.valueOf(((RobertoEditText) this$02.n0(R.id.chattext)).getText());
                                                qk.c cVar = fVar.E;
                                                ChatUser chatUser2 = fVar.f30783x;
                                                ChatUser chatUser22 = fVar.f30784y;
                                                String d10 = fVar.C.d();
                                                i.d(d10);
                                                cVar.b(valueOf, "Text", null, chatUser2, chatUser22, d10);
                                                ((RobertoEditText) this$02.n0(R.id.chattext)).setText("");
                                                return;
                                            }
                                            i.q("chatViewModel");
                                            throw null;
                                        }
                                        Toast.makeText(this$02, "Please type a message", 0).show();
                                        return;
                                    case 2:
                                        int i16 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        this$02.p0();
                                        int i17 = Build.VERSION.SDK_INT;
                                        int i18 = this$02.D;
                                        if (i17 >= 29) {
                                            uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
                                            Intent intent = new Intent("android.intent.action.PICK", uri);
                                            intent.setType("*/*");
                                            intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"application/txt", "application/pdf", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/msword"});
                                            this$02.startActivityForResult(Intent.createChooser(intent, "Select File"), i18);
                                            return;
                                        }
                                        Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                                        intent2.addCategory("android.intent.category.OPENABLE");
                                        intent2.setType("*/*");
                                        intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/msword", "*/*"});
                                        this$02.startActivityForResult(intent2, i18);
                                        return;
                                    case 3:
                                        int i19 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        this$02.p0();
                                        if (g0.a.a(this$02, "android.permission.CAMERA") == 0) {
                                            this$02.o0();
                                            return;
                                        } else if (f0.a.f(this$02, "android.permission.CAMERA")) {
                                            b.a aVar = new b.a(this$02);
                                            AlertController.b bVar = aVar.f1046a;
                                            bVar.f1036l = true;
                                            bVar.f1028c = R.drawable.ic_amaha_logo_white_bg;
                                            aVar.setTitle("Permission necessary");
                                            bVar.f1031g = "Camera permission is necessary";
                                            aVar.setPositiveButton(17039379, new c(this$02, 0));
                                            androidx.appcompat.app.b create = aVar.create();
                                            i.f(create, "alertBuilder.create()");
                                            create.show();
                                            return;
                                        } else {
                                            f0.a.e(this$02, this$02.C, com.appsflyer.R.styleable.AppCompatTheme_textColorSearchUrl);
                                            return;
                                        }
                                    case 4:
                                        int i20 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        this$02.p0();
                                        int i21 = Build.VERSION.SDK_INT;
                                        int i22 = this$02.F;
                                        if (i21 >= 29) {
                                            uri2 = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
                                            Intent intent3 = new Intent("android.intent.action.PICK", uri2);
                                            intent3.setType("image/*");
                                            this$02.startActivityForResult(Intent.createChooser(intent3, "Select File"), i22);
                                            return;
                                        }
                                        Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
                                        intent4.addCategory("android.intent.category.OPENABLE");
                                        intent4.setType("image/*");
                                        this$02.startActivityForResult(intent4, i22);
                                        return;
                                    case 5:
                                        int i23 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        this$02.p0();
                                        return;
                                    default:
                                        int i24 = CoachChatActivity.K;
                                        i.g(this$02, "this$0");
                                        if (((ConstraintLayout) this$02.n0(R.id.attachLinear)).getVisibility() == 8) {
                                            this$02.n0(R.id.chatTransparentLayout).setVisibility(0);
                                            ((ConstraintLayout) this$02.n0(R.id.attachLinear)).setVisibility(0);
                                            ((ConstraintLayout) this$02.n0(R.id.attachLinear)).measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                                            ValueAnimator ofInt = ValueAnimator.ofInt(0, ((ConstraintLayout) this$02.n0(R.id.attachLinear)).getMeasuredHeight());
                                            ofInt.addUpdateListener(new a9.c(2, this$02));
                                            ofInt.start();
                                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((ConstraintLayout) this$02.n0(R.id.attachLinear), "alpha", 0.0f, 1.0f);
                                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this$02.n0(R.id.chatTransparentLayout), "alpha", 0.0f, 1.0f);
                                            if (ofFloat != null) {
                                                ofFloat.setDuration(400L);
                                            }
                                            if (ofFloat != null) {
                                                ofFloat.start();
                                            }
                                            if (ofFloat2 != null) {
                                                ofFloat2.setDuration(400L);
                                            }
                                            if (ofFloat2 != null) {
                                                ofFloat2.start();
                                                return;
                                            }
                                            return;
                                        }
                                        this$02.p0();
                                        return;
                                }
                            }
                        });
                    }
                    ((RecyclerView) this$0.n0(R.id.chatlist)).setLayoutManager(new LinearLayoutManager(this$0));
                    ((RecyclerView) this$0.n0(R.id.chatlist)).setItemAnimator(new androidx.recyclerview.widget.c());
                    ArrayList<ChatMessage> arrayList = new ArrayList<>();
                    this$0.f10630z = arrayList;
                    this$0.A = new e(arrayList, this$0.f10628x, this$0);
                    RecyclerView recyclerView = (RecyclerView) this$0.n0(R.id.chatlist);
                    e eVar = this$0.A;
                    if (eVar != null) {
                        recyclerView.setAdapter(eVar);
                        f fVar = this$0.G;
                        if (fVar != null) {
                            DatabaseReference child = fVar.D.child("channels");
                            String d10 = fVar.C.d();
                            i.d(d10);
                            Query limitToLast = child.child(d10).child("messages").limitToLast(40);
                            i.f(limitToLast, "databaseReference.child(…ages\").limitToLast(count)");
                            fVar.F = limitToLast;
                            rk.c cVar = new rk.c(fVar);
                            fVar.G = cVar;
                            limitToLast.addChildEventListener(cVar);
                            f fVar2 = this$0.G;
                            if (fVar2 != null) {
                                fVar2.A.e(this$0, new a(this$0, 2));
                                ((AppCompatImageView) this$0.n0(R.id.sendmessage)).setOnClickListener(new View.OnClickListener() { // from class: pk.b
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        Uri uri;
                                        Uri uri2;
                                        int i13 = r2;
                                        boolean z10 = true;
                                        CoachChatActivity this$02 = this$0;
                                        switch (i13) {
                                            case 0:
                                                int i14 = CoachChatActivity.K;
                                                i.g(this$02, "this$0");
                                                this$02.finish();
                                                return;
                                            case 1:
                                                int i15 = CoachChatActivity.K;
                                                i.g(this$02, "this$0");
                                                if (n.F0(String.valueOf(((RobertoEditText) this$02.n0(R.id.chattext)).getText()), " ", "").length() <= 0) {
                                                    z10 = false;
                                                }
                                                if (z10) {
                                                    f fVar3 = this$02.G;
                                                    if (fVar3 != null) {
                                                        String valueOf = String.valueOf(((RobertoEditText) this$02.n0(R.id.chattext)).getText());
                                                        qk.c cVar2 = fVar3.E;
                                                        ChatUser chatUser2 = fVar3.f30783x;
                                                        ChatUser chatUser22 = fVar3.f30784y;
                                                        String d102 = fVar3.C.d();
                                                        i.d(d102);
                                                        cVar2.b(valueOf, "Text", null, chatUser2, chatUser22, d102);
                                                        ((RobertoEditText) this$02.n0(R.id.chattext)).setText("");
                                                        return;
                                                    }
                                                    i.q("chatViewModel");
                                                    throw null;
                                                }
                                                Toast.makeText(this$02, "Please type a message", 0).show();
                                                return;
                                            case 2:
                                                int i16 = CoachChatActivity.K;
                                                i.g(this$02, "this$0");
                                                this$02.p0();
                                                int i17 = Build.VERSION.SDK_INT;
                                                int i18 = this$02.D;
                                                if (i17 >= 29) {
                                                    uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
                                                    Intent intent = new Intent("android.intent.action.PICK", uri);
                                                    intent.setType("*/*");
                                                    intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"application/txt", "application/pdf", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/msword"});
                                                    this$02.startActivityForResult(Intent.createChooser(intent, "Select File"), i18);
                                                    return;
                                                }
                                                Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                                                intent2.addCategory("android.intent.category.OPENABLE");
                                                intent2.setType("*/*");
                                                intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/msword", "*/*"});
                                                this$02.startActivityForResult(intent2, i18);
                                                return;
                                            case 3:
                                                int i19 = CoachChatActivity.K;
                                                i.g(this$02, "this$0");
                                                this$02.p0();
                                                if (g0.a.a(this$02, "android.permission.CAMERA") == 0) {
                                                    this$02.o0();
                                                    return;
                                                } else if (f0.a.f(this$02, "android.permission.CAMERA")) {
                                                    b.a aVar = new b.a(this$02);
                                                    AlertController.b bVar = aVar.f1046a;
                                                    bVar.f1036l = true;
                                                    bVar.f1028c = R.drawable.ic_amaha_logo_white_bg;
                                                    aVar.setTitle("Permission necessary");
                                                    bVar.f1031g = "Camera permission is necessary";
                                                    aVar.setPositiveButton(17039379, new c(this$02, 0));
                                                    androidx.appcompat.app.b create = aVar.create();
                                                    i.f(create, "alertBuilder.create()");
                                                    create.show();
                                                    return;
                                                } else {
                                                    f0.a.e(this$02, this$02.C, com.appsflyer.R.styleable.AppCompatTheme_textColorSearchUrl);
                                                    return;
                                                }
                                            case 4:
                                                int i20 = CoachChatActivity.K;
                                                i.g(this$02, "this$0");
                                                this$02.p0();
                                                int i21 = Build.VERSION.SDK_INT;
                                                int i22 = this$02.F;
                                                if (i21 >= 29) {
                                                    uri2 = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
                                                    Intent intent3 = new Intent("android.intent.action.PICK", uri2);
                                                    intent3.setType("image/*");
                                                    this$02.startActivityForResult(Intent.createChooser(intent3, "Select File"), i22);
                                                    return;
                                                }
                                                Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
                                                intent4.addCategory("android.intent.category.OPENABLE");
                                                intent4.setType("image/*");
                                                this$02.startActivityForResult(intent4, i22);
                                                return;
                                            case 5:
                                                int i23 = CoachChatActivity.K;
                                                i.g(this$02, "this$0");
                                                this$02.p0();
                                                return;
                                            default:
                                                int i24 = CoachChatActivity.K;
                                                i.g(this$02, "this$0");
                                                if (((ConstraintLayout) this$02.n0(R.id.attachLinear)).getVisibility() == 8) {
                                                    this$02.n0(R.id.chatTransparentLayout).setVisibility(0);
                                                    ((ConstraintLayout) this$02.n0(R.id.attachLinear)).setVisibility(0);
                                                    ((ConstraintLayout) this$02.n0(R.id.attachLinear)).measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                                                    ValueAnimator ofInt = ValueAnimator.ofInt(0, ((ConstraintLayout) this$02.n0(R.id.attachLinear)).getMeasuredHeight());
                                                    ofInt.addUpdateListener(new a9.c(2, this$02));
                                                    ofInt.start();
                                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat((ConstraintLayout) this$02.n0(R.id.attachLinear), "alpha", 0.0f, 1.0f);
                                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this$02.n0(R.id.chatTransparentLayout), "alpha", 0.0f, 1.0f);
                                                    if (ofFloat != null) {
                                                        ofFloat.setDuration(400L);
                                                    }
                                                    if (ofFloat != null) {
                                                        ofFloat.start();
                                                    }
                                                    if (ofFloat2 != null) {
                                                        ofFloat2.setDuration(400L);
                                                    }
                                                    if (ofFloat2 != null) {
                                                        ofFloat2.start();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                this$02.p0();
                                                return;
                                        }
                                    }
                                });
                                ((RobertoEditText) this$0.n0(R.id.chattext)).addTextChangedListener(new d(this$0));
                                return;
                            }
                            i.q("chatViewModel");
                            throw null;
                        }
                        i.q("chatViewModel");
                        throw null;
                    }
                    i.q("chatAdapter");
                    throw null;
                } else if (!this$0.t0().isShowing()) {
                    this$0.t0().show();
                    return;
                } else {
                    return;
                }
            default:
                ArrayList mChats = (ArrayList) obj;
                int i13 = CoachChatActivity.K;
                i.g(this$0, "this$0");
                i.f(mChats, "mChats");
                if (!mChats.isEmpty()) {
                    ArrayList<ChatMessage> arrayList2 = this$0.f10630z;
                    if (arrayList2 != 0) {
                        arrayList2.add(u.o2(mChats));
                        RecyclerView recyclerView2 = (RecyclerView) this$0.n0(R.id.chatlist);
                        ArrayList<ChatMessage> arrayList3 = this$0.f10630z;
                        if (arrayList3 != null) {
                            recyclerView2.h0(arrayList3.size() - 1);
                            return;
                        } else {
                            i.q("chats");
                            throw null;
                        }
                    }
                    i.q("chats");
                    throw null;
                }
                return;
        }
    }
}
