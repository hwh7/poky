inherit gnomebase autotools pkgconfig

LICENSE = "GPLv2+ & LGPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=e7436dd55d7c05a5fa18f8cab10b3a6b"

SRC_URI = "https://download.gnome.org/sources/gjs/1.45/gjs-${PV}.tar.xz"
SRC_URI[md5sum] = "b577c0fc65a132bfb1f36b82129bfd3f"
SRC_URI[sha256sum] = "2807c8137e84ee8e5e461e1481870236778504089dbda39ba683f035adfb4d2a"

S = "${WORKDIR}/${PN}-${PV}"

DEPENDS += "g-ir-tools-host"
