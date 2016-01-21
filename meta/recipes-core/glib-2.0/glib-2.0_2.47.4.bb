require glib.inc

PE = "1"

SHRT_VER = "${@oe.utils.trim_version("${PV}", 2)}"

SRC_URI = "${GNOME_MIRROR}/glib/${SHRT_VER}/glib-${PV}.tar.xz \
           file://configure-libtool.patch \
           file://fix-conflicting-rand.patch \
           file://add-march-i486-into-CFLAGS-automatically.patch \
           file://glib-2.0-configure-readlink.patch \
           file://run-ptest \
           file://ptest-paths.patch \
           file://uclibc.patch \
           file://0001-configure.ac-Do-not-use-readlink-when-cross-compilin.patch \
           file://allow-run-media-sdX-drive-mount-if-username-root.patch \
          "

SRC_URI_append_class-native = " file://glib-gettextize-dir.patch"

SRC_URI[md5sum] = "299b6b738d9955e2231b6cbabfa48df7"
SRC_URI[sha256sum] = "4270129436fc2380e59f500b602d7c165cece208cda2872fdf1e8d1322cd1520"
