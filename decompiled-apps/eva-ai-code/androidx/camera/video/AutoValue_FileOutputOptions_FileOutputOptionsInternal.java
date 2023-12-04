package androidx.camera.video;

import androidx.camera.video.FileOutputOptions;
import java.io.File;
/* loaded from: classes.dex */
final class AutoValue_FileOutputOptions_FileOutputOptionsInternal extends FileOutputOptions.FileOutputOptionsInternal {
    private final File file;
    private final long fileSizeLimit;

    private AutoValue_FileOutputOptions_FileOutputOptionsInternal(File file, long j) {
        this.file = file;
        this.fileSizeLimit = j;
    }

    @Override // androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal
    File getFile() {
        return this.file;
    }

    @Override // androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal
    long getFileSizeLimit() {
        return this.fileSizeLimit;
    }

    public String toString() {
        return "FileOutputOptionsInternal{file=" + this.file + ", fileSizeLimit=" + this.fileSizeLimit + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FileOutputOptions.FileOutputOptionsInternal) {
            FileOutputOptions.FileOutputOptionsInternal fileOutputOptionsInternal = (FileOutputOptions.FileOutputOptionsInternal) obj;
            return this.file.equals(fileOutputOptionsInternal.getFile()) && this.fileSizeLimit == fileOutputOptionsInternal.getFileSizeLimit();
        }
        return false;
    }

    public int hashCode() {
        long j = this.fileSizeLimit;
        return ((this.file.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    /* loaded from: classes.dex */
    static final class Builder extends FileOutputOptions.FileOutputOptionsInternal.Builder {
        private File file;
        private Long fileSizeLimit;

        @Override // androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal.Builder
        FileOutputOptions.FileOutputOptionsInternal.Builder setFile(File file) {
            if (file == null) {
                throw new NullPointerException("Null file");
            }
            this.file = file;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal.Builder
        public FileOutputOptions.FileOutputOptionsInternal.Builder setFileSizeLimit(long j) {
            this.fileSizeLimit = Long.valueOf(j);
            return this;
        }

        @Override // androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal.Builder
        FileOutputOptions.FileOutputOptionsInternal build() {
            String str = this.file == null ? " file" : "";
            if (this.fileSizeLimit == null) {
                str = str + " fileSizeLimit";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new AutoValue_FileOutputOptions_FileOutputOptionsInternal(this.file, this.fileSizeLimit.longValue());
        }
    }
}
