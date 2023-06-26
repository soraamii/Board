function makePages(page, size, total) {

  console.log(page, size, total);

  // 시작 페이지 번호 -> 1, 11, 21 ..
  const startNum = (Math.ceil(page/10.0) * 10) - 9;

  console.log(`StartNum ${startNum}`);

  let result = "";

  console.log("result", result);

  // 이전 페이지 버튼 생성
  if(startNum !== 1) {
    `<a class="btn btn-primary" href="${startNum-1}"><</a>`
  }

  // 실제 페이지 번호 버튼 생성
  let temp = startNum;

  console.log("temp", temp);
  console.log("startNum", startNum);

  while(true) {

    if(temp * size > total) {
      break;
    }

    console.log(temp);

    result += `<a class="btn btn-primary" href="${temp}">${temp}</a>`

    console.log("result", result)
    temp++;

  }

  if(total % (size * 10) === 1) {
    result += `<a class="btn btn-primary" href="${startNum + 10}">></a>`
  }

  console.log(result);
  return result;



}