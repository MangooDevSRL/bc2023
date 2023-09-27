import client from 'app/entities/client/client.reducer';
import transaction from 'app/entities/transaction/transaction.reducer';
import product from 'app/entities/product/product.reducer';
/* jhipster-needle-add-reducer-import - JHipster will add reducer here */

const entitiesReducers = {
  client,
  transaction,
  product,
  /* jhipster-needle-add-reducer-combine - JHipster will add reducer here */
};

export default entitiesReducers;
