;;
;; Note: this file is used in tests that rely on line numbers
;;
(ns metagetta-test.test-ns1.protocols)

(defprotocol ProtoTest
  "Protocol comment."
  (operation-one [x]
    "Operation 1 docs")
  (multi-args [x] [x y]
    "Multi args docs")
  (alpha [a])
  (zoolander [y])
  (beta [z])
  (matilda [m]))
