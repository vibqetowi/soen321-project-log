package cc.cloudist.acplibrary;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import cc.cloudist.acplibrary.views.CustomView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes3.dex */
public final class ACProgressCustom extends ACProgressBaseDialog {
    private static final int FILE_TYPE = 1;
    private static final int NO_TYPE = -1;
    private static final int RESOURCE_TYPE = 0;
    private List<Bitmap> mBitmaps;
    private Builder mBuilder;
    private CustomView mCustomView;
    private int mResourceCount;
    private int mSpinCount;
    private Timer mTimer;

    static /* synthetic */ int access$308(ACProgressCustom aCProgressCustom) {
        int i = aCProgressCustom.mSpinCount;
        aCProgressCustom.mSpinCount = i + 1;
        return i;
    }

    private ACProgressCustom(Builder builder) {
        super(builder.mContext);
        this.mSpinCount = 0;
        this.mBuilder = builder;
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: cc.cloudist.acplibrary.ACProgressCustom.1
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                if (ACProgressCustom.this.mTimer != null) {
                    ACProgressCustom.this.mTimer.cancel();
                    ACProgressCustom.this.mTimer = null;
                }
                if (ACProgressCustom.this.mBitmaps != null) {
                    ACProgressCustom.this.mBitmaps.clear();
                    ACProgressCustom.this.mBitmaps = null;
                }
                ACProgressCustom.this.mSpinCount = 0;
                ACProgressCustom.this.mResourceCount = 0;
                ACProgressCustom.this.mCustomView = null;
            }
        });
    }

    @Override // android.app.Dialog
    public void show() {
        if (this.mBuilder.mType != -1) {
            if (this.mCustomView == null) {
                this.mBitmaps = new ArrayList();
                int minimumSideOfScreen = (int) (getMinimumSideOfScreen(this.mBuilder.mContext) * this.mBuilder.mSizeRatio);
                int i = 0;
                if (this.mBuilder.mType == 0) {
                    this.mResourceCount = this.mBuilder.mResources.size();
                    while (i < this.mResourceCount) {
                        this.mBitmaps.add(BitmapFactory.decodeResource(this.mBuilder.mContext.getResources(), ((Integer) this.mBuilder.mResources.get(i)).intValue()));
                        i++;
                    }
                } else {
                    this.mResourceCount = this.mBuilder.mFilePaths.size();
                    while (i < this.mResourceCount) {
                        this.mBitmaps.add(BitmapFactory.decodeFile((String) this.mBuilder.mFilePaths.get(i)));
                        i++;
                    }
                }
                this.mCustomView = new CustomView(this.mBuilder.mContext, minimumSideOfScreen, this.mBitmaps);
            }
            super.setContentView(this.mCustomView);
            super.show();
            long j = 1000.0f / this.mBuilder.mSpeed;
            Timer timer = new Timer();
            this.mTimer = timer;
            timer.scheduleAtFixedRate(new TimerTask() { // from class: cc.cloudist.acplibrary.ACProgressCustom.2
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    int i2 = ACProgressCustom.this.mSpinCount % ACProgressCustom.this.mResourceCount;
                    ACProgressCustom.this.mCustomView.updateIndex(i2);
                    if (i2 == 0) {
                        ACProgressCustom.this.mSpinCount = 1;
                    } else {
                        ACProgressCustom.access$308(ACProgressCustom.this);
                    }
                }
            }, j, j);
            return;
        }
        Log.d(ACProgressCustom.class.toString(), "you must assign the image source in Builder");
    }

    /* loaded from: classes3.dex */
    public static class Builder {
        private Context mContext;
        private float mSizeRatio = 0.2f;
        private List<Integer> mResources = new ArrayList();
        private List<String> mFilePaths = new ArrayList();
        private int mType = -1;
        private float mSpeed = 6.67f;

        public Builder(Context context) {
            this.mContext = context;
        }

        public Builder sizeRatio(float f) {
            this.mSizeRatio = f;
            return this;
        }

        public Builder speed(float f) {
            this.mSpeed = f;
            return this;
        }

        public Builder useImages(Integer... numArr) {
            if (numArr != null && numArr.length != 0) {
                this.mResources.clear();
                Collections.addAll(this.mResources, numArr);
                this.mType = 0;
            }
            return this;
        }

        public Builder useFiles(String... strArr) {
            if (strArr != null && strArr.length != 0) {
                this.mFilePaths.clear();
                Collections.addAll(this.mFilePaths, strArr);
                this.mType = 1;
            }
            return this;
        }

        public ACProgressCustom build() {
            return new ACProgressCustom(this);
        }
    }
}
