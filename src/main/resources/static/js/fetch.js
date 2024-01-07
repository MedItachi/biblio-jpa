function addAuthor(){
	console.log(document.getElementById('id').value)
	let url = 'authors';

	let data = {
		id:document.getElementById('id').value,
		name:document.getElementById('name').value,
		yearBorn:document.getElementById('yearBorn').value,
	}
	
	let options = {
		method:'POST',
		body:JSON.stringify(data),
		headers:{
			'Content-type':'application/json'
		}
	}
	
	fetch(url, options)
		.then(res => {
			console.log(res)
			return res.json()
		})
		.then(
			
			data => {
				console.log(data)
				let	html=`<p>Id: ${data.id}`;
					html+=`<p>name: ${data.name}`;
					html+=`<p>yearBorn: ${data.yearBorn}`;
				document.getElementById("result").innerHTML=html
			}
		).catch(
			err => console.log(err)
		)
}