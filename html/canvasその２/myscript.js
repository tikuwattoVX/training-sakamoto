// myscript.js
window.onload = function() {
  draw();
}

function draw() {
  var canvas = document.getElementById('mycanvas');
  if (!canvas || !canvas.getContext) return false;
  var ctx = canvas.getContext('2d');

  // 四角（塗りつぶしなし）
  // ctx.strokeRect(50,10,50,50);

  // 四角（塗りつぶしあり）
  // ctx.fillRect(10,10,50,50);

  // 四角消しゴム
  // ctx.clearRect(15,15,20,20);

  // スタイル変更の練習
  ctx.strokeStyle = "red";
  ctx.lineWidth = 15;
  ctx.lineJoin = "bevel";
  ctx.fillStyle = "rgba(255, 0, 0, 0.5)";
  ctx.strokeRect(10, 10, 50, 50);
  ctx.fillRect(100, 10, 50, 50);

}
