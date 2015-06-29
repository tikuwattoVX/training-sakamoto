use strict;
use warnings;

# 変数：データ（スカラー値、配列、ハッシュ）につけるラベル

# スカラー（単一の値：数値、文字列）変数

my $name = "tom";
my $a = "hh\the${name}llo\n"; #特殊文字（\n, \t）
my $b = 'hello';

print $a;
print "hello" . "world\n";
print "hello" x 5;
