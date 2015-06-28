<html>
  <head>
	<meta http-equiv="Content-Type" content="text/html; charset=Shift_JIS">
	<title>お問い合わせフォーム</title>
  </head>
  <body>
  	<?php 
  		// お問い合わせタイトル、詳細のセット
      $name = htmlspecialchars($_POST['username'], ENT_QUOTES);
  		$title = htmlspecialchars($_POST['title'], ENT_QUOTES);
  		$message = htmlspecialchars($_POST['message'], ENT_QUOTES);
  	?>
  	◼︎お問い合わせ内容を確認してください。
  	<br>
  	<form action="send_inpuiry.php" method="POST">
    <input type="hidden" name="username" value="<?php echo $name; ?>">
  	<input type="hidden" name="title" value="<?php echo $title; ?>">
  	<input type="hidden" name="message" value="<?php echo $message; ?>">
    お名前：
    <br>
    <?php echo $name; ?>
    <br>
    <br>
  	お問い合わせタイトル：
  	<br>
  	<?php echo $title; ?>
  	<br>
  	<br>
  	お問い合わせ内容詳細：
  	<br>
  	<?php echo nl2br($message); ?>
  	<br>
  	<br>
  	<input type="submit" value="お問い合わせ内容の送信">
    </form>
  </body>
</html>