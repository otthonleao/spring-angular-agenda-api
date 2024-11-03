import { Component, OnInit } from '@angular/core';
import { Contato } from './contato';

@Component({
  selector: 'app-contato',
  templateUrl: './contato.component.html',
  styleUrls: ['./contato.component.css']
})
export class ContatoComponent implements OnInit {

  constructor(
		// private service: ContatoService
	) { }

  ngOnInit(): void {
		// const c : Contato = new Contato();
		// c.nome = 'Nome do ngOnInit';
		// c.email = 'ng-on-init@email.com';
		// c.favorito = false;

		// this.service.save(c).subscribe((resposta) => {
		// 	console.log(resposta);
		// });
  }

}
